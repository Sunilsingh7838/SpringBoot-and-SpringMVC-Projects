package org.TimeStamp;

import java.util.Date;

import org.TimeStamp.entity.Product;
import org.TimeStamp.repo.ProductRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class DataJpaTimestampingApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(DataJpaTimestampingApplication.class, args);
		
		ProductRepository repository = context.getBean(ProductRepository.class);
		
//		Product p1 = new Product();
//		p1.setPid(101);
//		p1.setPname("Keyboard");
//		p1.setPrice(500.00);
//		p1.setCreatedDate(new Date());
		
		Product p2 = new Product();
		p2.setPid(102);
		p2.setPname("Mouse");
		p2.setPrice(300.00);
		p2.setCreatedDate(new Date());
		p2.setUpdatedDate(new Date());
		
		repository.save(p2);
	}

}
