package in.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import in.mvc.binding.Book;

@Controller
public class BookController {
	
	@GetMapping("/")
	public String displayForm(Model model) {
		Book bookObj = new Book();
		model.addAttribute("book", bookObj);
		return"index";
	}

	@PostMapping("/book")
	public String saveBook(Book book, Model model) {
		System.out.println(book);
		System.out.println("Book Name: "+book.getBookName());
//		System.out.println("Book Author: "+book.getBookAuthor());
//		System.out.println("Book Price: "+book.getBookPrice());
		model.addAttribute("msg" ,"Book Saved Successfully");
		return "success";
	}
}
