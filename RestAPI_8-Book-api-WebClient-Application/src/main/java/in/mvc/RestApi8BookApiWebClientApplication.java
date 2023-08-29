package in.mvc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.mvc.client.BookClient;

@SpringBootApplication
public class RestApi8BookApiWebClientApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(RestApi8BookApiWebClientApplication.class, args);
		BookClient bean = context.getBean(BookClient.class);
//		bean.invokeGetBooks();
		bean.invokeGetBooksAsync();
//		bean.invokePostBook();
	}

}
