package in.mvc.service;

import java.util.List;

import in.mvc.entity.Book;


public interface DataService {

	public List<Book> getAllData();
	public String addBook(Book book);
}
