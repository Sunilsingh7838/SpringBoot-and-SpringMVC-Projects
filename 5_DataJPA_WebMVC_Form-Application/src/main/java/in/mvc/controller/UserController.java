package in.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import in.mvc.binding.User;
import jakarta.validation.Valid;

@Controller
public class UserController {

	@GetMapping("/")
	public String getForm(Model model) {
		User userObj = new User();
		model.addAttribute("user", userObj);
		return "index";
	}
	
	@PostMapping("/register")
	public String handleRegisterbtn(@Valid User userForm, BindingResult result, Model model) {
		if(result.hasErrors()) {
			return "index";
		}
		System.out.println(userForm.getUname());
		System.out.println(userForm.getPhno());
		System.out.println(userForm.getAge());
		System.out.println(userForm.getEmail());
		System.out.println("********");
		//Logic to store form data in db.
		model.addAttribute("msg" ,"Your Registration Successful..");
		return"success";
	}
	
	
}
