package in.mvc.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import in.mvc.binding.Book;

@Controller
public class BookController {

	@GetMapping("/book")
	public String getBookData(Model model) {
		
		//Setting data to binding object
		Book bookObj = new Book(101,"Java", 500.00);
		Book bookObj1 = new Book(102,"spring", 500.00);
		Book bookObj2 = new Book(103,"Hibernate", 600.00);
		
		//Adding data to model object to send to UI
		
//		List<Book> bookList = Arrays.asList( bookObj, bookObj1, bookObj2);
		model.addAttribute("book", bookObj);
		model.addAttribute("book", bookObj1);
		
		//return View Name
		return "book";
	}
	
//	@GetMapping("/books")
//	public String getBookData1(Model model) {
//	Book bkObj = new Book(101,"spring", 500.00);
//	Book bkObj1 = new Book(102,"Hibernate", 600.00);

//	Book bkObj2 = new Book();
//	bkObj2.setBookId(103);
//	bkObj2.setBookName("Spring Boot");
//	bkObj2.setBookPrice(700.00);
//
//	Book bkObj3 = new Book();
//	bkObj3.setBookId(104);
//	bkObj3.setBookName("Spring MVC");
//	bkObj3.setBookPrice(800.00);

	
	 
//	 model.addAttribute("book",map);
	

//	List<Book> bookList = Arrays.asList(bkObj, bkObj1);
//
//	model.addAttribute("books", bookList);
//	return "books";
//	}
}
