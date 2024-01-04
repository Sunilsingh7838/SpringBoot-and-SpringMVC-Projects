package in.mvc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.mvc.dto.ResponseDto;
import in.mvc.dto.StudentDto;
import in.mvc.entity.RegistrationForm;
import in.mvc.repo.RegistrationDetail;

@Service
public class RegistrationServiceImpl implements RegistrationService{

//	@Autowired
//	private DataRepository repository;
	
	@Autowired
	private RegistrationDetail registrationDetailRepo;
	
	@Override
	public ResponseDto insertDetail(RegistrationForm registrationForm) {
		
		ResponseDto responseDto = new ResponseDto();
		
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
		registrationDetailRepo.save(data);
		responseDto.setMessage("Data saved successfully!");
		responseDto.setStatus("success");
		responseDto.setData(data);
		System.out.println(registrationForm);
		return responseDto;
	}

	@Override
	public ResponseDto getRegisterationDetail() {
		 List<RegistrationForm> registrationForm = registrationDetailRepo.findAll();
		 ResponseDto responseDto = new ResponseDto();
		 System.out.println(registrationForm);
		 responseDto.setData(registrationForm);
		 responseDto.setStatus("200");
		return responseDto;
	}

	@Override
	public ResponseDto updateRegistrationDetail(StudentDto registrationForm) {
		RegistrationForm registrationFormObj = registrationDetailRepo.findByEmailId(registrationForm.getEmail());
		registrationFormObj.setFirstName(registrationForm.getFirstName());
		registrationFormObj.setLastName(registrationForm.getLastName());
		registrationFormObj.setContact(registrationForm.getContact());
		registrationFormObj.setEmail(registrationForm.getEmail());
		registrationFormObj.setDoB(registrationForm.getDoB());
		registrationFormObj.setGender(registrationForm.getGender());
		registrationFormObj.setPinCode(registrationForm.getPinCode());
		registrationFormObj.setAddress(registrationForm.getAddress());
		registrationFormObj.setState(registrationForm.getState());
		registrationFormObj.setCountry(registrationForm.getCountry());
		///SAVE THE DATA in database
		registrationDetailRepo.save(registrationFormObj);
		ResponseDto responseDto = new ResponseDto();
		responseDto.setData(registrationFormObj);
		responseDto.setStatus("200");
		responseDto.setMessage("success");
		return responseDto;
	}






	
}
