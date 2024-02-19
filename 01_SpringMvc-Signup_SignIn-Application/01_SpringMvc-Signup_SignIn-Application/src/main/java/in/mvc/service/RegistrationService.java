package in.mvc.service;

import java.util.List;

import org.springframework.stereotype.Service;

import in.mvc.dto.ResponseDto;
import in.mvc.dto.StudentDto;
import in.mvc.entity.RegistrationForm;

@Service
public interface RegistrationService {
	public ResponseDto insertDetail(RegistrationForm registrationForm);

	public ResponseDto getRegisterationDetail();

	public ResponseDto updateRegistrationDetail(StudentDto registrationForm);

	public ResponseDto validateRegistration(RegistrationForm registrationForm);

	public ResponseDto validateLogin(StudentDto studentDto);

	public ResponseDto deleteUsers(List<Integer> id);

	public ResponseDto getUserDetailByEmail(String emailId);

}
