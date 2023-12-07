package in.mvc.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import in.mvc.entity.RegistrationForm;

@Repository
public interface DataRepository extends JpaRepository<RegistrationForm, Integer>{

}
