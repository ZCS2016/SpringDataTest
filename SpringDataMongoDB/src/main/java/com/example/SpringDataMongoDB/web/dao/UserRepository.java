package com.example.SpringDataMongoDB.web.dao;

import com.example.SpringDataMongoDB.web.entity.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User,Integer> {
}
