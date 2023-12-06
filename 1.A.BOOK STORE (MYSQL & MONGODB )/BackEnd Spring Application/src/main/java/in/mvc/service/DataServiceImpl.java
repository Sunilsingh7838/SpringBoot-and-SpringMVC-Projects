package in.mvc.service;

import java.util.List;

import org.springframework.stereotype.Service;

import in.mvc.dao.DataRepository;
import in.mvc.entity.Book;

@Service
public class DataServiceImpl implements DataService{

//	@Autowired
	private DataRepository dataRepository;
	
	
	public DataServiceImpl(DataRepository dataRepository) {
		this.dataRepository = dataRepository;
	}

	@Override
	public List<Book> getAllData(){
		return dataRepository.findAll();
	}
	
	@Override
	public String addBook(Book book) {
		System.out.println(book);
		dataRepository.save(book);
		return "";
	}
}
