package in.mvc.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookRestController {
	
	@GetMapping("/book/{name}")
	public ResponseEntity<String> getBookPrice(@PathVariable("name")String name){
		
		String respbody = name + " Price is 500.00";
		
		return new ResponseEntity<>(respbody, HttpStatus.OK);
	}
	
	@GetMapping("/book/{bname}/{aname}")
	public ResponseEntity<String> getBook(@PathVariable("bname") String bname,@PathVariable("aname") String aname){
		
		String respbody = bname+ " of " + aname +" is not Avaliable.";
		
		return new ResponseEntity<>(respbody, HttpStatus.OK);
		
		
	}

}
