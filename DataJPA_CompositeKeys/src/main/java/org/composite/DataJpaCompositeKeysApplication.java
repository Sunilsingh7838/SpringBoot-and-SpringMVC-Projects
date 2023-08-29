package org.composite;

import org.composite.service.AccountService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class DataJpaCompositeKeysApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(DataJpaCompositeKeysApplication.class, args);
		
		AccountService accountService = context.getBean(AccountService.class);
		
		accountService.saveAccData();
		accountService.saveAccData1();
		
		accountService.getDataUsingPK();
		
		context.close();
		
		
		
	}

}
