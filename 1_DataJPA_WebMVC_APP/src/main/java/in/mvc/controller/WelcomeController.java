package in.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class WelcomeController {
	
	@GetMapping("/welcome")
	public ModelAndView getWelcomeMessage() {
		
		ModelAndView mav = new ModelAndView();
		
		mav.addObject("msg" , "Welcome to first Spring MVC Application");
		mav.setViewName("index");
		return mav;
		
	}

}
