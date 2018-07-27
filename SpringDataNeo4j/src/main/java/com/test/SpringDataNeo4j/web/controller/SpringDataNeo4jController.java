package com.test.SpringDataNeo4j.web.controller;

import com.test.SpringDataNeo4j.web.dao.PersonRepository;
import com.test.SpringDataNeo4j.web.entity.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/SpringDataNeo4j")
public class SpringDataNeo4jController {
    @Autowired
    private PersonRepository personRepository;


    @RequestMapping("/person")
    public List<Person> person(){
        List<Person> personList = new ArrayList<>();
        personRepository.findAll().forEach(person -> personList.add(person));
        return personList;
    }

    @RequestMapping("/findPersonByName")
    public Person findPersonByName(){
        Person person = personRepository.findPersonByName("Tom Hanks");
        return person;
    }

}
