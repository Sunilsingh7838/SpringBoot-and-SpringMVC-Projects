package in.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import in.mvc.binding.Product;

@Controller
public class ProductController {
	
	@GetMapping("/")
	public String getProductForm(Model model) {
		
		Product product = new Product();
		model.addAttribute("product", product);
		return "index";
	}

	@PostMapping("/product")
	public String handleFormSubmit(Product product, Model model) {
//		System.out.println(product.getProductId());
//		System.out.println(product.getProductName());
//		System.out.println(product.getProductPrice());
		System.out.println("Product ID: " + product.getProductId() );
        System.out.println("Product Name: " + product.getProductName() );
        System.out.println("Product Price: " + product.getProductPrice() );
		
		model.addAttribute("msg" , "Product Saved Successfully");
		return"success";
		
	}
}
