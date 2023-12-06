package in.mvc.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import in.mvc.entity.Book;
import in.mvc.service.DataService;

@RestController
@RequestMapping("/api")
//@CrossOrigin(value = {"GET", "POST"})
public class DataController {

	@Autowired
	private DataService dataService;
	
	@GetMapping("/showData")
	public List<Book> getAllData(){
		return dataService.getAllData();
	}
	
	@PostMapping("/addData")
	public ResponseEntity<String> addBook(Book book){
		String msg = dataService.addBook(book);
		return new ResponseEntity<>(msg, HttpStatus.CREATED);
	}
}








