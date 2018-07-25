package com.test.SpringDataRedis.web.dao;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.stereotype.Component;

@Component
public class UserDao {
    @Cacheable("users")
    public String getUserById(String userId){
        System.out.println("Real query user: " + userId);
        return getFormDB(userId);
    }

    private String getFormDB(String userId){
        System.out.println("Real query db: " + userId);
        return "A";
    }
}
