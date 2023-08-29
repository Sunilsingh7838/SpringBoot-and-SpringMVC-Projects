package in.mvc.bindings;

public class Book {

	private Integer Id;
	private String Name;
	private double Price;
	private Author author;
	
	public Author getAuthor() {
		return author;
	}
	public void setAuthor(Author author) {
		this.author = author;
	}
	public Integer getId() {
		return Id;
	}
	public void setId(Integer id) {
		Id = id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public double getPrice() {
		return Price;
	}
	public void setPrice(double price) {
		Price = price;
	}
	@Override
	public String toString() {
		return "Book [Id=" + Id + ", Name=" + Name + ", Price=" + Price + ", author=" + author + "]";
	}
	
	
}
