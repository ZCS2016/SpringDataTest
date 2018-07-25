package com.test.SpringDataMongoDB.web.controller;

import com.test.SpringDataMongoDB.web.dao.UserRepository;
import com.test.SpringDataMongoDB.web.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

@RestController
@RequestMapping("/SpringDataMongoDB")
public class SpringDataMongoDBController {
    @Autowired
    private MongoTemplate mongoTemplate;

    @Autowired
    private UserRepository userRepository;

    @RequestMapping("/showDB")
    public String showDB(){
        String dbName = mongoTemplate.getDb().getName();
        return dbName;
    }

    @RequestMapping("/showCollections")
    public Set<String> showCollections(){
        Set<String> collectionNames = mongoTemplate.getCollectionNames();
        return collectionNames;
    }

    @RequestMapping("/save")
    public User save(){
        User user = new User();
        user.setId(1);
        user.setName("UserA");
        user.setAge(1);
        mongoTemplate.save(user);
        return user;
    }

    @RequestMapping("/all")
    public List<User> all(){
        List<User> userList = new ArrayList<>();

        userRepository.findAll().forEach(user -> userList.add(user));

        return userList;
    }
}
