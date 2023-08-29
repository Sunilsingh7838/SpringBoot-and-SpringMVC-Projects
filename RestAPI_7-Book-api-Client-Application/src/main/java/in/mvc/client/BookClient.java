package in.mvc.client;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import in.mvc.binding.Book;

@Service
public class BookClient {
	
	public void invokeBookTicket() {
		
		String Url = "https://sites.google.com/view/club-genius/about-us";
		Book book = new Book();
		book.setBookName("Alchemist");
		book.setBookPrice(230.00);
		
		RestTemplate rt = new RestTemplate();
		ResponseEntity<String> postForEntity = rt.postForEntity(Url, rt, String.class);
		System.out.println(postForEntity.getBody());
	}
	
	//for get book json data into object form
	public void invokeGetBookTicket() {
		
		String Url = "https://sites.google.com/view/club-genius/about-us";
		RestTemplate rt = new RestTemplate();
		ResponseEntity<Book[]> forEntity = rt.postForEntity(Url, rt, Book[].class);
		Book[] body = forEntity.getBody();
		for(Book book:body) {
			System.out.println(book);
		}
	}
	
	

}
