package com.example.demo.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.entity.Player;

public interface PlayerRepository extends CrudRepository<Player, Integer > {
	

}
