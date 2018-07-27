package com.example.SpringDataJPA.web.controller;

import com.example.SpringDataJPA.web.dao.UserRepository;
import com.example.SpringDataJPA.web.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

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
