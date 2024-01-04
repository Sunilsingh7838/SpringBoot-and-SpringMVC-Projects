package in.mvc.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import in.mvc.entity.RegistrationForm;

@Repository
public interface RegistrationDetail extends JpaRepository<RegistrationForm, Integer>{

	
	List<RegistrationForm> findAll();
	 	
	@Query("SELECT r FROM RegistrationForm r WHERE r.email = :email")
	public RegistrationForm findByEmailId(@Param("email") String email) ;
		
	

}
