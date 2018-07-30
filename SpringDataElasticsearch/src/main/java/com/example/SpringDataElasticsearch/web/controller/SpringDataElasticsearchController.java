package com.example.SpringDataElasticsearch.web.controller;

import com.example.SpringDataElasticsearch.web.dao.UserRepository;
import com.example.SpringDataElasticsearch.web.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.elasticsearch.core.ElasticsearchTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/SpringDataElasticsearch")
public class SpringDataElasticsearchController {
    @Autowired
    private ElasticsearchTemplate elasticsearchTemplate;
    @Autowired
    private UserRepository userRepository;

    @RequestMapping("/put")
    public User put(){
        User user = new User();
        user.setId(1);
        user.setName("A");

        userRepository.save(user);

        return user;
    }

    @RequestMapping("/get")
    public User get(){
        User user = userRepository.findById(1).get();

        return user;
    }

}
