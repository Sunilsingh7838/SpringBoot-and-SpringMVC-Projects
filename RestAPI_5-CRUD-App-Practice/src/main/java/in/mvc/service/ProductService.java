package in.mvc.service;

import java.util.List;

import in.mvc.entity.Product;

public interface ProductService {


	public String upsertProduct(Product product);
	public List<Product> getAllProduct();
	public String deleteProduct(Integer productId);
}
