package in.mvc.dao;


import org.springframework.data.jpa.repository.JpaRepository;

import in.mvc.entity.Book;

public interface DataRepository extends JpaRepository<Book, Integer> {

}
