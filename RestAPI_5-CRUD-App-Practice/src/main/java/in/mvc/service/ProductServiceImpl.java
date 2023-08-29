package in.mvc.service;

import java.util.List;

import org.springframework.stereotype.Service;

import in.mvc.entity.Product;
import in.mvc.repo_dao.ProductDao_Repository;

@Service
public class ProductServiceImpl implements ProductService {

	private ProductDao_Repository repository;
	
	public ProductServiceImpl(ProductDao_Repository repository) {
		this.repository = repository;
	}

	
	@Override
	public List<Product> getAllProduct() {
		return repository.findAll();
	}

	@Override
	public String upsertProduct(Product product) {
		
		Integer productId = product.getProductId();
		System.out.println(product);
		
		repository.save(product);
		System.out.println(product);
		if(productId==null) {
			return "Record Inserted";
		}
		else {
			return "Record updated";
		}
	}

	@Override
	public String deleteProduct(Integer productId) {
		repository.deleteById(productId);
		return "Product Deleted";
	}



}
