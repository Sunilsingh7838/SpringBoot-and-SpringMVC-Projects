package in.mvc.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name="Book_DETAIL02")
public class Book {

	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	@Column(name="BOOK-ID")
	private Integer bookId;

	@Column(name="BOOK_NAME")
	private String bookName;

	@Column(name="BOOK_AUTHOR")
	private String bookAuthor;

	
}
