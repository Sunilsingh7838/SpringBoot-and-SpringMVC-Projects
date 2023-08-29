package org.app;

import java.util.List;

import org.app.entity.User;
import org.app.repository.UserRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class DataJpaApplication2Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(DataJpaApplication2Application.class, args);

		UserRepository repository = context.getBean(UserRepository.class);


		/*
		User u1 = new User(101,"Sunil" ,"male", 23,"India");
		 * User p1 = new User(); p1.setUserId(101); p1.setUserName("Sunil singh");
		 * p1.setGender("male"); p1.setAge(23); p1.setCountry("India");
		 * 
		 * User p2 = new User(); p2.setUserId(102); p2.setUserName("Ammy");
		 * p2.setGender("Female"); p2.setAge(24); p2.setCountry("India");
		 * 
		 * User p3 = new User(); p3.setUserId(103); p3.setUserName("Anderson");
		 * p3.setGender("male"); p3.setAge(30); p3.setCountry("Australia");
		 * 
		 * User p4 = new User(); p4.setUserId(104); p4.setUserName("Jeetu");
		 * p4.setGender("male"); p4.setAge(35); p4.setCountry("India");
		 * 
		 * User p5 = new User(); p5.setUserId(105); p5.setUserName("Jai Shanker");
		 * p5.setGender("male"); p5.setAge(50); p5.setCountry("India");
		 */

		/*
		 * User p6 = new User(); p6.setUserId(106); p6.setUserName("Jenny");
		 * p6.setGender("Female"); p6.setAge(25); p6.setCountry("USA");
		 */

//	repository.saveAll(Arrays.asList(p1, p2, p3, p4, p5, p6)); 
		// also called upsert method because it check and update and insert in db.
//	System.out.println("Data inserted to MySql..................");

		/*
		 * Iterable<User> findAll = repository.findAll(); findAll.forEach(user ->{
		 * System.out.println(user); });
		 */

		/*
		 * long count = repository.count();
		 * System.out.println("Total Records in table : " + count);
		 */

		
		/*
		 * List<User> findbycountry = repository.findByCountry("INDIA");
		 * 
		 * findbycountry.forEach(user-> { System.out.println(user); });
		 * 
		 * List<User> findByAge = repository.findByAge(30);
		 * 
		 * findByAge.forEach(user-> { System.out.println(user);
		 * 
		 * });
		 * 
		 * List<User> list= repository.findByAgeGreaterThanEqual(24);
		 * list.forEach(user->{ System.out.println(user); });
		List<User> list = repository.findByCountryAndAge("India", 23);
		list.forEach(user->{ System.out.println(user); });
		 */
		
		List <User> users = repository.getAllUsersHql();
		users.forEach(user->{ System.out.println(user); });
		
		System.out.println("--------------------------------------------");
		
		users = repository.getAllUserssql();
		users.forEach(user->{ System.out.println(user); });
		
		
		System.out.println("--------------------------------------------");
		users = repository.getAllUsersByCountry("India");
		users.forEach(user->{ System.out.println(user); });
		 
		

	}

}
