package in.mvc.service;

import java.util.List;

import org.springframework.stereotype.Service;

import in.mvc.entity.Book;
import in.mvc.repo.BookRepository;

@Service
public class BookServiceImpl implements BookService {

	private BookRepository repository;

	public BookServiceImpl(BookRepository repository) {
		this.repository = repository;
	}
	
	@Override
	public String upsertBook(Book book) {
		
		Integer bookId = book.getBookId();
		System.out.println(book);
		
		repository.save(book);
		System.out.println(book);
		
		if (bookId==null) {
			return "Record Inserted";
		} else {

			return "Record Updated";
		}
	}

	@Override
	public List<Book> getAllBooks() {
		return repository.findAll();
	}

	@Override
	public String deleteBook(Integer bookId) {
		repository.deleteById(bookId);
		return "Book Deleted.";
	}

}
