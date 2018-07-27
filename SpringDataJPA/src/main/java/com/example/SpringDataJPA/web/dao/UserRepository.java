package com.example.SpringDataJPA.web.dao;

import com.example.SpringDataJPA.web.entity.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User,String> {
}
