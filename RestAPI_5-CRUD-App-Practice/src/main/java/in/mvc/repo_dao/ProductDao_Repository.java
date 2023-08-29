package in.mvc.repo_dao;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import in.mvc.entity.Product;

public interface ProductDao_Repository extends JpaRepository<Product,Serializable>{

}
