package com.test.SpringDataJPA.web.dao;

import com.test.SpringDataJPA.web.entity.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User,String> {
}
