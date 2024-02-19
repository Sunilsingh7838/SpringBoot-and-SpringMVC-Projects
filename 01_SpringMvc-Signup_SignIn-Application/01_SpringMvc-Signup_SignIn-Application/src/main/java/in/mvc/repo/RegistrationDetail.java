package in.mvc.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import in.mvc.dto.StudentDto;
import in.mvc.entity.RegistrationForm;

@Repository
public interface RegistrationDetail extends JpaRepository<RegistrationForm, Integer> {

	@Query("SELECT r FROM RegistrationForm r WHERE r.email = :email")
	public RegistrationForm existsByEmail(@Param("email") String email);

	List<RegistrationForm> findAll();

	@Query("SELECT r FROM RegistrationForm r WHERE r.email = :email")
	public RegistrationForm findByEmailId(@Param("email") String email);
	
	 //@Query("SELECT new com.example.StudentDto(r.email, r.password) FROM RegistrationForm r WHERE r.email = :email")
	//SELECT password FROM registration_form.registration_form where email = 'singh@gmail.com';
	//SELECT r.password FROM registration_form.registration_form r WHERE r.email = 'singh@gmail.com';

	@Query("SELECT r.password FROM RegistrationForm r WHERE r.email = :email")
	public StudentDto authenticateByEmailId(@Param("email") String email);
	

}
