package in.mvc.controller;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import in.mvc.dto.ResponseDto;
import in.mvc.dto.StudentDto;
import in.mvc.entity.RegistrationForm;
import in.mvc.service.RegistrationService;

@Controller
@CrossOrigin()
public class RestController {

	@Autowired
	private RegistrationService service;

	public static final Logger Log = LogManager.getLogger(RestController.class);

	@GetMapping("/")
	public String getRegistrationform(Model model) {
		Log.info("getRegistrationform Loaded.... ");
		RegistrationForm regForm = new RegistrationForm();
		model.addAttribute("user", regForm);
		return "index";
	}

	@PostMapping("/register")
	public @ResponseBody ResponseDto addRegistrationData(@RequestBody RegistrationForm registrationForm) {
		Log.info("addRegistrationData called.... ");
			return service.insertDetail(registrationForm);
	}

	@GetMapping("/showRegistrationformUI")
	public String showRegistrationformUI(Model model) {
		Log.info("showRegistrationformUI called.... ");
		RegistrationForm regForm = new RegistrationForm();
		model.addAttribute("user", regForm);
		return "formdetail";
	}

	@GetMapping("/getRegisterationDetail")
	public @ResponseBody ResponseDto getRegisterationDetail() {
		Log.info("getRegisterationDetail called.... ");
		return service.getRegisterationDetail();
	}

	@PutMapping("/updateRegistrationDetail")
	public @ResponseBody ResponseDto updateRegistrationDetail(@RequestBody StudentDto registrationForm) {
		Log.info("updateRegistrationDetail called.... ");
		return service.updateRegistrationDetail(registrationForm);
	}

	@GetMapping("/getLogin")
	public String getLogin(Model model) {
		Log.info("getLogin Loaded.... ");
		RegistrationForm regForm = new RegistrationForm();
		model.addAttribute("user", regForm);
		return "login";
	}

	@PostMapping("/validateRegistration")
	public @ResponseBody ResponseDto validateRegistration(@RequestBody RegistrationForm registrationForm) {
		Log.info("validateRegistration called.... ");
		return service.validateRegistration(registrationForm);
	}
		
		//Login Handler
	
	@GetMapping("/getWelcomePage")
	public String getWelcomePage(Model model) {
		Log.info("getWelcomePage Loaded.... ");
		RegistrationForm regForm = new RegistrationForm();
		model.addAttribute("user", regForm);
		return "welcome";
	}
	
	@PostMapping("/validateLogin")
	public @ResponseBody ResponseDto validateLogin(@RequestBody StudentDto studentDto) {
		Log.info("validateLogin called.... ");
		return service.validateLogin(studentDto);
			
	}

	@DeleteMapping("/deleteUsers")
	public @ResponseBody ResponseDto deleteUsers(@RequestParam List<Integer> id) {
		Log.info("deleteUsers called.... ");
		return service.deleteUsers(id);
	}
	
	@GetMapping("/updateUserDetail")
	public String updateUserDetail(Model model) {
		Log.info("updateUserDetail Loaded.... ");
		return "update_user_detail";
	}
	
	@GetMapping("/getUserDetailByEmail")
	public @ResponseBody ResponseDto getUserDetailByEmail( @RequestParam String emailId) {
		Log.info("getUserDetailByEmail called.... ");
		return service.getUserDetailByEmail(emailId);
	}

}
