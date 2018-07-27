package com.example.SpringDataRedis.web.controller;

import com.example.SpringDataRedis.web.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.support.atomic.RedisAtomicLong;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

@RestController
@RequestMapping("/SpringDataRedis")
@EnableCaching
public class SpringDataRedisController {
    @Autowired
    private RedisConnectionFactory connectionFactory;

    @Autowired
    private StringRedisTemplate stringRedisTemplate;

    @Autowired
    private UserDao userDao;

    @RequestMapping("/keys")
    public Set<String> keys(){
        Set<String> keys = stringRedisTemplate.keys("*");

        return keys;
    }

    @RequestMapping("/set")
    public Set<String> set(){
        stringRedisTemplate.opsForValue().set("a","1");
        Set<String> keys = stringRedisTemplate.keys("*");
        return keys;
    }

    @RequestMapping("/hset")
    public Set<Object> hset(){
        String mapKey = "map:1";

        Map<String,String> attrs = new HashMap<>();
        attrs.put("a","1");
        attrs.put("b","2");
        attrs.put("c","3");

        stringRedisTemplate.opsForHash().putAll(mapKey,attrs);

        Set<Object> keys = stringRedisTemplate.opsForHash().keys(mapKey);
        return keys;
    }

    @RequestMapping("/atomicLong")
    public Long atomicLong(){
        String countKey = "count";

        RedisAtomicLong atomicLong = new RedisAtomicLong(countKey,connectionFactory);

        Long count = atomicLong.incrementAndGet();

        return count;
    }

    @RequestMapping("/publish")
    public String publish(){
        String message = "Hello World!";
        stringRedisTemplate.convertAndSend("channel1",message);
        return message;
    }

    @RequestMapping("/cache")
    public String cache(){
        String userId = "1";
        userDao.getUserById(userId);
        userDao.getUserById(userId);
        userDao.getUserById(userId);
        return "RedisCacheTest";
    }
}
