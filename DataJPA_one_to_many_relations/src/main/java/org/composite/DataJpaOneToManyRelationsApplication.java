package org.composite;

import java.util.Arrays;
import java.util.List;

import org.composite.entity.Address;
import org.composite.entity.Employee;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class DataJpaOneToManyRelationsApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(DataJpaOneToManyRelationsApplication.class, args);
		
		
		Employee e = new Employee();
		e.setEmpName("Sunil");
		e.setEmpSalary(25000.00);
		
		Address a1 = new Address();
		a1.setCity("New Delhi");
		a1.setState("Delhi");
		a1.setCountry("India");
		a1.setEmp(e);
		
		Address a2 = new Address();
		a2.setCity("Paris Tower");
		a2.setState("Paris");
		a2.setCountry("France");
		a2.setEmp(e);
		
		//setting addresses to emp
		List<Address> addrList = Arrays.asList(a1, a2);
		e.setAddr(addrList);
		
		EmpRepository empRepository = context.getBean(EmpRepository.class);
		empRepository.save(e);
		
		System.out.println("Records Inserted.........");
		
	}

}
