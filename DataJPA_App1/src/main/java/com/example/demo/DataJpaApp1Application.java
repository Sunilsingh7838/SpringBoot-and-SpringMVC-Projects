package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import com.example.demo.entity.Player;
import com.example.demo.repository.PlayerRepository;


@SpringBootApplication
public class DataJpaApp1Application {

	public static void main(String[] args) {
		
ConfigurableApplicationContext context = SpringApplication.run(DataJpaApp1Application.class, args);
		
PlayerRepository playerRepository = context.getBean(PlayerRepository.class);
		
		Player p1 = new Player();
		p1.setPlayerId(101);
		p1.setPlayerName("abc");
		p1.setPlayerAge(1);
		p1.setLocation("pqr");
		
		playerRepository.save(p1);
		System.out.println("Data inserted..................");
		
	}

}
