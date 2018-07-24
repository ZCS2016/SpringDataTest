package com.test.SpringDataJPA.web.controller;

import com.test.SpringDataJPA.dao.UserRepository;
import com.test.SpringDataJPA.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

@RestController
@RequestMapping("/SpringDataJPA")
public class SpringDataJPAController {
    @Autowired
    UserRepository userRepository;

    @RequestMapping("/all")
    public List<User> getAll(){
        List<User> userList = new ArrayList<>();

        userRepository.findAll().forEach(user -> userList.add(user));

        return userList;
    }

}
