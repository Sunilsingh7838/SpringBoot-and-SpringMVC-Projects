package org.app.repository;

import java.util.List;

import org.app.entity.User;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User,Integer>{
	
	/*
	 * public List<User> findByCountry(String cname);
	 * public List<User> findByAge(Integer ages);
	 * 
	 * public List<User> findByAgeGreaterThanEqual(Integer Age);
	 * 
	 * public List<User> findByCountryAndAge(String country, Integer age);
	 */
	
 
	@Query(value = "From User")
	public List<User> getAllUsersHql();
	
	@Query(value = "select * from user_master" , nativeQuery= true)
	public List<User> getAllUserssql();
	
	@Query(value = "From User where country = :cname") // named positional parameter
	public List<User> getAllUsersByCountry(String cname);

}
