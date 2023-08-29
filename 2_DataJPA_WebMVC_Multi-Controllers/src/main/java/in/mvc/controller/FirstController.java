package in.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class FirstController {

	@GetMapping("/welcome")
	public ModelAndView getWelcomeMessage() {
		
		ModelAndView mav = new ModelAndView();
		
		mav.addObject("msg", "Welcome to Multicontroller Web Application.");
		mav.setViewName("welcome");
		return mav;
	}
	
	@GetMapping("/greet")
	public ModelAndView getGreetMessage() {
		
		ModelAndView mav = new ModelAndView();
		
		mav.addObject("msg", "Good Afternoon! Sunil Singh...");
		mav.setViewName("greet");
		return mav;
	}
}
