package in.mvc.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import in.mvc.bindings.BookTable;

@Controller
public class TableController {

	@GetMapping("/book")
	public String getTableBookData(Model model) {

		BookTable bkObj = new BookTable();
		bkObj.setBookId(101);
		bkObj.setBookName("Spring2");
		bkObj.setBookPrice(500.00);

		
		BookTable bkObj1 = new BookTable();
		bkObj1.setBookId(102);
		bkObj1.setBookName("Hibernate");
		bkObj1.setBookPrice(600.00);

		BookTable bkObj2 = new BookTable();
		bkObj2.setBookId(103);
		bkObj2.setBookName("Spring Boot");
		bkObj2.setBookPrice(700.00);

		BookTable bkObj3 = new BookTable();
		bkObj3.setBookId(104);
		bkObj3.setBookName("Spring MVC");
		bkObj3.setBookPrice(800.00);

		
//		 Map<String,Object> map= new HashMap<>();
//		 
//		 map.put("book",bkObj);
//		 map.put( "book",bkObj1); 
//		 map.put("book",bkObj2);
//		 map.put("book",bkObj3);
		 
//		 model.addAttribute("book",map);
		

		List<BookTable> bookList = Arrays.asList(bkObj, bkObj1, bkObj2, bkObj3);

		model.addAttribute("book", bookList);
		return "book";
	}

}
