package in.mvc.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeRestController {
	
	@GetMapping("/welcome")
	public ResponseEntity<String> getWelcomeMsg(@RequestParam("name") String name){
		
		String respPayLoad = "Hello! " +name+" This is first RestFul webservices application.";
		
	return	new ResponseEntity<>(respPayLoad, HttpStatus.OK);
	}

	
	@GetMapping("/greet")
	public String getGreetMessage() {
		String respPayLoad = "Good Afernoon!!....";
		return respPayLoad;
	}
}
