package in.mvc.service;

import java.util.ArrayList;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.mvc.dto.ResponseDto;
import in.mvc.dto.StudentDto;
import in.mvc.entity.RegistrationForm;
import in.mvc.repo.RegistrationDetail;

@Service
public class RegistrationServiceImpl implements RegistrationService {

	@Autowired
	private RegistrationDetail registrationDetailRepo;

	public static final Logger Log = LogManager.getLogger(RegistrationServiceImpl.class);

	String email;

	@Override
	public ResponseDto insertDetail(RegistrationForm registrationForm) {
		Log.info("insertDetail Executed Successfully....... ");
		ResponseDto responseDto = new ResponseDto();
		try {
			boolean isValid = isValidEmail(registrationForm.getEmail());

			if (!isValid) {
				RegistrationForm data = new RegistrationForm();
				data.setFirstName(registrationForm.getFirstName());
				data.setLastName(registrationForm.getLastName());
				data.setDoB(registrationForm.getDoB());
				data.setGender(registrationForm.getGender());
				data.setContact(registrationForm.getContact());
				data.setEmail(registrationForm.getEmail());
				data.setPassword(registrationForm.getPassword());
				data.setConfirmPassword(registrationForm.getConfirmPassword());
				data.setAddress(registrationForm.getAddress());
				data.setState(registrationForm.getState());
				data.setPinCode(registrationForm.getPinCode());
				data.setCountry(registrationForm.getCountry());
				registrationDetailRepo.save(data);
				Log.info("Data Saved to Repo to registrationDetailRepo ");
				responseDto.setMessage("Data saved successfully!");
				responseDto.setStatus("success");
				responseDto.setData(data);
				System.out.println(registrationForm);
			} else {
				Log.info("Data not Saved due to Duplicate entry of this email in Repo of registrationDetailRepo ");
				responseDto.setMessage("Failed due to Duplicate Entry.!");
				responseDto.setStatus("failed");
			}
		} catch (Exception e) {
			Log.warn("Problem occured while Saving data to registrationDetailRepo");
			e.printStackTrace();
		}
		return responseDto;

	}

	public boolean isValidEmail(String email) {
		boolean result = false;
		RegistrationForm emailObj = registrationDetailRepo.existsByEmail(email);

		if (emailObj != null) {
			return true;
		}
		return result;
	}

	@Override
	public ResponseDto getRegisterationDetail() {
		Log.info("getRegisterationDetail Executed Successfully....... ");
		List<RegistrationForm> registrationForm = registrationDetailRepo.findAll();
		ResponseDto responseDto = new ResponseDto();
		try {
			System.out.println(registrationForm);
			responseDto.setData(registrationForm);
			responseDto.setStatus("200");
			return responseDto;
		} catch (Exception e) {
			Log.warn("Problem occured while getting data with getRegisterationDetail.");
			e.printStackTrace();
		}
		return responseDto;
	}

	@Override
	public ResponseDto updateRegistrationDetail(StudentDto registrationForm) {
		Log.info("updateRegistrationDetail Executed Successfully....... ");
		ResponseDto responseDto = new ResponseDto();
		try {
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
			/// SAVE THE DATA in database
			registrationDetailRepo.save(registrationFormObj);
			responseDto.setData(registrationFormObj);
			//responseDto.setStatus("200");
			responseDto.setStatusCode(200);
			responseDto.setMessage("success");
			Log.info("Data Saved in registrationDetailRepo.... ");
			return responseDto;
		} catch (Exception e) {
			Log.warn("Problem occured while getting data with updateRegistrationDetail.");
			e.printStackTrace();
		}
		return responseDto;
	}

	@Override
	public ResponseDto validateRegistration(RegistrationForm registrationForm) {
		Log.info("validateRegistration Executed Successfully....... ");
		ResponseDto responseDto = new ResponseDto();
		RegistrationForm registrationFormObj = registrationDetailRepo.findByEmailId(registrationForm.getEmail());
		try {
			registrationFormObj.setPassword(registrationForm.getPassword());
			registrationDetailRepo.save(registrationFormObj);
			responseDto.setData(registrationFormObj);
			responseDto.setStatus("200");
			responseDto.setMessage("success");
			Log.info("Data Saved in registrationDetailRepo.... ");
			return responseDto;
		} catch (Exception e) {
			Log.warn("Problem occured while getting data with validateRegistration.");
			e.printStackTrace();
		}

		return responseDto;
	}

	@Override
	public ResponseDto validateLogin(StudentDto studentDto) {
		Log.info("validateLogin Executed Successfully....... ");
		// Object objUserData;
		ResponseDto responseDto = new ResponseDto();
		boolean authEmail = authenticateEmail(studentDto.getUserEmail());
		RegistrationForm personDetail = personDetail(studentDto.getUserEmail());
		try {
			if (authEmail) {
				if (studentDto.getPassword().equals(personDetail.getPassword())) {
					responseDto.setData(personDetail);
					responseDto.setMessage("Login successfull");
					responseDto.setStatus("success");
					responseDto.setStatusCode(200);
					responseDto.setErrorCode(0);
				} else {
					responseDto.setMessage("password_mismatch");
					responseDto.setStatus("failed");
					responseDto.setStatusCode(401);
					responseDto.setErrorCode(1);
				}
			} else {
				// User not exist try SignUp!
				responseDto.setMessage("User not exist");
				responseDto.setStatus("unauthorised");
				responseDto.setStatusCode(404);
				responseDto.setErrorCode(2);
			}

			return responseDto;
		} catch (Exception e) {
			Log.warn("Problem occured while getting data with validateLogin.");
			e.printStackTrace();
		}
		return responseDto;
	}

	public boolean authenticateEmail(String email) {
		Log.info("authenticateEmail Executed Successfully....... ");
		boolean result = false;
		RegistrationForm emailObj = registrationDetailRepo.existsByEmail(email);
		if (emailObj != null) {
			return true;
		}
		return result;
	}

	public RegistrationForm personDetail(String email) {
		Log.info("personDetail Executed Successfully....... ");
		RegistrationForm emailObj = registrationDetailRepo.existsByEmail(email);
		return emailObj;
	}

	@Override
	public ResponseDto deleteUsers(List<Integer> id) {
		Log.info("deleteUsers Executed Successfully....... ");
		ResponseDto responseDto = new ResponseDto();

		try {
			List<RegistrationForm> listOfUsersIds = registrationDetailRepo.findAllById(id);
//			id, firstname, 
//			id,firstname, lasstname
//			id,firstname,lastname
			/*
			 * List<Integer> listOfIds = new ArrayList<>(); List<Integer> ids;
			 */
			if(!listOfUsersIds.isEmpty()) {
				for (RegistrationForm user : listOfUsersIds) {
					// ids = user.getId();
					registrationDetailRepo.deleteById(user.getId());
				}
				responseDto.setMessage("DATA_DELETED");
				responseDto.setStatusCode(200);
				responseDto.setErrorCode(0);
				responseDto.setSuccess(true);
			}else {
				responseDto.setMessage("NOTHING_TO_DELETE");
				responseDto.setStatusCode(404);
				responseDto.setErrorCode(1);
				responseDto.setSuccess(false);
			}
		} catch (Exception e) {
			Log.warn("Problem occured while deleting data.");
			e.printStackTrace();
			responseDto.setMessage("NOT_DELETED");
			responseDto.setStatusCode(500);
			responseDto.setErrorCode(2);
			responseDto.setSuccess(false);
		}
		return responseDto;
	}

	@Override
	public ResponseDto getUserDetailByEmail(String emailId) {
		Log.info("getUserDetailByEmail Executed Successfully....... ");
		ResponseDto responseDto = new ResponseDto();
		RegistrationForm userObj = registrationDetailRepo.findByEmailId(emailId);
		if(!(userObj == null)) {
		responseDto.setData(userObj);
		responseDto.setStatusCode(200);
		responseDto.setMessage("success");
		}else {
			responseDto.setStatusCode(404);
		}
		return responseDto;
	}

}
