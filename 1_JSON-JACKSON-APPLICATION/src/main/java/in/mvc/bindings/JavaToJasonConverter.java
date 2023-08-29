package in.mvc.bindings;

import java.io.File;

import com.fasterxml.jackson.databind.ObjectMapper;

public class JavaToJasonConverter {

	public static void main(String[] args) throws Exception {
		
		Author author = new Author();
		author.setAuthorName("Alex");
		author.setAuthorEmail("Alex@gmail.com");
		author.setAuthorPhno( 123456789l);
		
		Book book = new Book();
		book.setId(101);
		book.setName("Spring");
		book.setPrice(300.00);
		book.setAuthor(author);
		
		
		ObjectMapper mapper = new ObjectMapper();
		//Converting java file to Jason and store into file.
		mapper.writeValue(new File("book.json"), book);
		System.out.println("File converted to Jason.......");
	}
}
