package in.mvc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class RestApi6ClientRestTemplateApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestApi6ClientRestTemplateApplication.class, args);
		
		String apiURL = "https://sites.google.com/view/club-genius/home";
		RestTemplate rt = new RestTemplate();
		ResponseEntity<String> forEntity = rt.getForEntity(apiURL, String.class);
		String body = forEntity.getBody();
		System.out.println(body);
		
	}

}
