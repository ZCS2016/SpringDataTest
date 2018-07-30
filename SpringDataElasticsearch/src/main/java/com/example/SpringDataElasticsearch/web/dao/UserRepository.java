package com.example.SpringDataElasticsearch.web.dao;

import com.example.SpringDataElasticsearch.web.entity.User;
import org.springframework.data.elasticsearch.repository.ElasticsearchCrudRepository;

public interface UserRepository extends ElasticsearchCrudRepository<User,Integer> {
}
