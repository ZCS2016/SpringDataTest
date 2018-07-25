package com.test.SpringDataMongoDB.web.dao;

import com.test.SpringDataMongoDB.web.entity.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User,Integer> {
}
