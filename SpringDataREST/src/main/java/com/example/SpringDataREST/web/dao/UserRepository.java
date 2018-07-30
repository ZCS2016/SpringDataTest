package com.example.SpringDataREST.web.dao;

import com.example.SpringDataREST.web.entity.User;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface UserRepository extends PagingAndSortingRepository<User,String> {
}
