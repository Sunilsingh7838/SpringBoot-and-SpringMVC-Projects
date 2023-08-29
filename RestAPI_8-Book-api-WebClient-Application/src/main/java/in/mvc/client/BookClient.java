package in.mvc.client;

import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import in.mvc.binding.Book;

@Service
public class BookClient {

	
	public void invokePostBook() {
		
		Book book = new Book();
		book.setBookName("Angular");
		book.setBookPrice(123.123);
		
				
		String Url = "https.......";
		
		WebClient client = WebClient.create();
		String body = client.post()
				.uri(Url)
				.bodyValue(book)               //HTTP Response Body data.
				.retrieve()
				.bodyToMono(String.class)
				.block();
		System.out.println(body);
	}
	public void invokeGetBooks() {
		String Url = "https:........";
		WebClient client = WebClient.create();
//		String block = client.get()              //GetRequest
//				.uri(Url)                        //EndPoint url
//				.retrieve()                      //Retrive ResponseBody
//				.bodyToMono(String.class)         //Bind Response Data
//				.block();                         //Make it sync
//		System.out.println(block);
		
		Book[] responseBody = client.get()
		.uri(Url)
		.retrieve()
		.bodyToMono(Book[].class)
		.block();                               //sync communtication
		
		for(Book b : responseBody) {
			System.out.println(b);
		}
	}
	
	public void invokeGetBooksAsync() {
		String Url = "https:........";
		WebClient client = WebClient.create();
				client.get()
				.uri(Url)
				.retrieve()
				.bodyToMono(Book[].class)
				.subscribe(BookClient::respHandler);            // async Communication
				
				System.out.println("Request Sent");
	}
	
	public static void respHandler(Book[] book) {
		for(Book b : book) {
			System.out.println(b);
			
		}
	}
}
