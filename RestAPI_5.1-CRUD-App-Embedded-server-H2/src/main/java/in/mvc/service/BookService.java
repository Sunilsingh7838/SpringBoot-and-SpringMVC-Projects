package in.mvc.service;

import java.util.List;

import in.mvc.entity.Book;

public interface BookService {

	
	public String upsertBook(Book book);
	public List<Book> getAllBooks();
	public String deleteBook(Integer bookId);
}

