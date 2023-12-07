package in.mvc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.mvc.dao.DataRepository;
import in.mvc.entity.RegistrationForm;

@Service
public class RegistrationServiceImpl implements RegistrationService{

	@Autowired
	private DataRepository repository;
	
	@Override
	public String insertDetail(RegistrationForm registrationForm) {
		System.out.println(registrationForm);
		RegistrationForm data = new RegistrationForm();
		data.setFirstName(registrationForm.getFirstName());
		data.setLastName(registrationForm.getLastName());
		data.setDoB(registrationForm.getDoB());
		data.setGender(registrationForm.getGender());
		data.setContact(registrationForm.getContact());
		data.setEmail(registrationForm.getEmail());
		data.setAddress(registrationForm.getAddress());
		data.setState(registrationForm.getState());
		data.setPinCode(registrationForm.getPinCode());
		data.setCountry(registrationForm.getCountry());
		repository.save(data);
		System.out.println(registrationForm);
		return "Form Submitted Succussfully";
	}



	
}
