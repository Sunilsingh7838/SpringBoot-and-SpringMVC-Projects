package org.app;

import java.util.List;

import org.app.entity.User;
import org.app.repository.UserRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

@SpringBootApplication
public class DataJpaApplication2Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(DataJpaApplication2Application.class, args);

		UserRepository repository = context.getBean(UserRepository.class);

		/*
		 * User u7 = new User(107 ,"Anshika" ,"Female", 24,"India" ); User u8 = new
		 * User(108 ,"Jhon" ,"male", 45,"USA" ); User u9 = new User(109 ,"Smith"
		 * ,"male", 35,"Australia" ); User u10 = new User(110 ,"Jason" ,"male",
		 * 24,"West Indies" ); User u11 = new User(111 ,"Peter Parker" ,"male",
		 * 34,"Russia" ); User u12 = new User(112 ,"Valdimer" ,"male", 55,"Russia" );
		 * User u13 = new User(113 ,"Willson" ,"Female", 44,"USA" );
		 */
		
		/*
		 * User p7 = new User(); p7.setUserId(107); p7.setUserName("Anshika");
		 * p7.setGender("Female"); p7.setAge(24); p7.setCountry("India");
		 */
		
		/*
		 * User p8 = new User(); p8.setUserId(108); p8.setUserName("Anshika");
		 * p8.setGender("Female"); p8.setAge(24); p8.setCountry("India");
		 * 
		 * User p9 = new User(); p9.setUserId(109); p9.setUserName("Jason");
		 * p9.setGender("male"); p9.setAge(44); p9.setCountry("Africa");
		 * 
		 * User p10 = new User(); p10.setUserId(110); p10.setUserName("Warner");
		 * p10.setGender("male"); p10.setAge(55); p10.setCountry("Australia");
		 * 
		 * User p11 = new User(); p11.setUserId(111); p11.setUserName("Jhon");
		 * p11.setGender("male"); p11.setAge(29); p11.setCountry("USA");
		 * 
		 * User p12 = new User(); p12.setUserId(112); p12.setUserName("Putin");
		 * p12.setGender("male"); p12.setAge(55); p12.setCountry("Russia");
		 */
		
//		repository.saveAll(Arrays.asList(p8, p9, p10,p11, p12));
//		repository.delete(p12);
		
//		List<User> users = repository.findAll(Sort.by("age").ascending());
		
//		users.forEach(user ->{System.out.println(user);});
		
//		repository.saveAll(Arrays.asList(u7,u8,u9,u10,u11,u12,u13));
		
		/*
		 * PageRequest pageRequest = PageRequest.of(0,4);
		 * 
		 * Page<User> pageData = repository.findAll(pageRequest);
		 * 
		 * List<User> users = pageData.getContent(); users.forEach(user
		 * ->{System.out.println(user);});
		 */
		
		User entity = new User();
		
		entity.setCountry("India");
		entity.setAge(24);
		
		Example<User> example = Example.of(entity);
		
		List<User> users =  repository.findAll(example);
		
		users.forEach(user->{System.out.println(user);});
		
		

	}

}
