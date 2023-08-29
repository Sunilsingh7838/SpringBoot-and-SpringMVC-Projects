package org.composite;

import java.util.Date;

import org.composite.entity.Passport;
import org.composite.entity.Person;
import org.composite.repository.PassportRepository;
import org.composite.repository.PersonRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class DataJpaOneToOneRelationApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context =  SpringApplication.run(DataJpaOneToOneRelationApplication.class, args);
		
		PersonRepository personRepo = context.getBean(PersonRepository.class);
		
		PassportRepository passportRepo = context.getBean(PassportRepository.class);
		
		Person p = new Person();
		p.setPersonName("Alex");
		p.setPersonGender("male");
//		Calendar cal = new Instance;
		Passport psprt = new Passport();
		psprt.setPassportNum("HRQPK1233");
		psprt.setIssueDate(new Date());
		
//		psprt.setExpiryDate(new Date().setYear(new Date().getYear()+10));
//		psprt.setExpiryDate(new Date().);
		
		p.setPassport(psprt);
		psprt.setPerson(p);
		
		personRepo.save(p);
		
		
		
		
		
	}

}
