package in.mvc.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import in.mvc.entity.Product;
import in.mvc.service.ProductService;

@RestController
public class ProductRestController {
	
	@Autowired
	private ProductService productService;

//	@GetMapping("/products")
	@GetMapping("/test")
	public String getAllProduct() {
//		public ResponseEntity<List<Product>> getAllProduct() {
//		List<Product> allProduct = productService.getAllProduct();
//		return new ResponseEntity<> (allProduct,HttpStatus.OK);
		String msg = "Application running....";
		return msg;
	}
	
	@PostMapping("/product-add")
	public ResponseEntity<String> addProduct(@RequestBody Product product) {
		String msg = productService.upsertProduct(product);
		return new ResponseEntity<>(msg, HttpStatus.CREATED);
	}
	
	@PutMapping("/product-update")
	public ResponseEntity<String> updateProduct(@RequestBody Product product){
		String msg = productService.upsertProduct(product);
		return new ResponseEntity<>(msg, HttpStatus.OK);
		
	}
	
	@DeleteMapping("/product/{productId}")
	public ResponseEntity<String> deleteProduct(@PathVariable Integer productId) {
		String msg = productService.deleteProduct(productId);
		return new ResponseEntity<>(msg, HttpStatus.OK);
	}

}
