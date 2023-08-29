package org.composite;

import org.composite.service.UserService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class DataJpa_blob_App  {

	public static void main(String[] args) throws Exception {
		ConfigurableApplicationContext context = SpringApplication.run(DataJpa_blob_App.class, args);
		
		UserService userService = context.getBean(UserService.class);
		
		userService.saveUser();
	}

}
