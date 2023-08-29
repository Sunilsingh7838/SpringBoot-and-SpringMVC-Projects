package in.mvc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.mvc.client.BookClient;

@SpringBootApplication
public class RestApi7BookApiClientApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext run = SpringApplication.run(RestApi7BookApiClientApplication.class, args);
		BookClient bean = run.getBean(BookClient.class);
		bean.invokeBookTicket();
	}

}
