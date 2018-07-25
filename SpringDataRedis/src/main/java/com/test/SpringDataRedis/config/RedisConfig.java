package com.test.SpringDataRedis.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.connection.RedisSentinelConfiguration;
import org.springframework.data.redis.connection.RedisStandaloneConfiguration;
import org.springframework.data.redis.connection.lettuce.LettuceConnectionFactory;

@Configuration
public class RedisConfig {

    /**
     * Lettuce
     */
    @Bean
    public LettuceConnectionFactory lettuceConnectionFactory(){
        return new LettuceConnectionFactory(new RedisStandaloneConfiguration("192.168.65.131",6379));
    }
}
