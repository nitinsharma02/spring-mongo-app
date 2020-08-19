package com.example.spring.mongo.api.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.spring.mongo.api.model.Player;

public interface PlayerRepository extends MongoRepository<Player, Integer>{

}
