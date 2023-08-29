package in.mvc.rest;

import java.util.Arrays;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import in.mvc.binding.Product;

@RestController
public class ProductRestController{
	
//	@GetMapping(value = "/product", produces={"application/xml"})
	@GetMapping(value="/product")
	public ResponseEntity<Product> getProduct(){
		
		Product product = new Product();
		product.setpId(101);
		product.setpName("Keyboard");
		product.setPrice(700.00);
		
		return new ResponseEntity<>(product, HttpStatus.OK);
	}
	
	@GetMapping("/products")
	public ResponseEntity<List<Product>> getProducts(){
		
		Product p1 = new Product(101,"Hibernate",500.00);
		Product p2 = new Product(102,"Spring",700.00);
		Product p3 = new Product(103,"Spring mvc",900.00);
		
		List<Product> product = Arrays.asList(p1,p2,p3);
		
		return new ResponseEntity<>(product, HttpStatus.OK);
		
	}

}
