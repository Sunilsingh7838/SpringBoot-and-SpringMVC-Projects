package in.mvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
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
	
	@GetMapping("/")
	public String getRegistrationform(Model model) {
		RegistrationForm regForm = new RegistrationForm();
		model.addAttribute("user",regForm);
		return "index";
	}
	
	@PostMapping("/register")
	public @ResponseBody ResponseDto addRegistrationData(@RequestBody RegistrationForm registrationForm){
		return service.insertDetail(registrationForm);
	}
	
	@GetMapping("/showRegistrationformUI")
	public String showRegistrationformUI(Model model) {
		RegistrationForm regForm = new RegistrationForm();
		model.addAttribute("user",regForm);
		return "formdetail";
	}
	
	@GetMapping("/getRegisterationDetail")
	public @ResponseBody ResponseDto getRegisterationDetail() {
		return service.getRegisterationDetail();
	}
	
	@PutMapping("/updateRegistrationDetail")
	public @ResponseBody ResponseDto updateRegistrationDetail(@RequestBody StudentDto registrationForm) {
		return service.updateRegistrationDetail(registrationForm);
	}
	
	

}
