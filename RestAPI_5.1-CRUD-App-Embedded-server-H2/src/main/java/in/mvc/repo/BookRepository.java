package in.mvc.repo;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import in.mvc.entity.Book;

public interface BookRepository extends JpaRepository<Book, Serializable>{

}
