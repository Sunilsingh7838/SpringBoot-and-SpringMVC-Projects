package in.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class SecondController {
	
	@GetMapping("/wish")
	public ModelAndView getWishMessage() {
		
		ModelAndView mav = new ModelAndView();
		
		mav.addObject("msg", " Hi! I am Welcome page.");
		mav.setViewName("wish");
		return mav;
	}

}
