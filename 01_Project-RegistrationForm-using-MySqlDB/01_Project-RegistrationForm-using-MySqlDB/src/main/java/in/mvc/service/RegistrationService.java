package in.mvc.service;

import org.springframework.stereotype.Service;

import in.mvc.dto.ResponseDto;
import in.mvc.dto.StudentDto;
import in.mvc.entity.RegistrationForm;

@Service
public interface RegistrationService {
	public ResponseDto insertDetail(RegistrationForm registrationForm);

	public ResponseDto getRegisterationDetail();

	ResponseDto updateRegistrationDetail(StudentDto registrationForm);
}
