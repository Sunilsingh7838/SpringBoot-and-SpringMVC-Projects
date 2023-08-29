package in.mvc.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import in.mvc.binding.Book;

@RestController
public class BookRestController {
	
	@PostMapping(value = "/book", consumes = {"application/xml","application/json"})
	public ResponseEntity<String> addBook(@RequestBody Book book){
		System.out.println(book);
		//logic to store data in database.
		String msg = "Book added Successfully.";
		return new ResponseEntity<String>(msg, HttpStatus.CREATED);
	}

}
