package in.mvc.service;

import org.springframework.stereotype.Service;

import in.mvc.entity.RegistrationForm;

@Service
public interface RegistrationService {
	public String insertDetail(RegistrationForm registrationForm);
}
