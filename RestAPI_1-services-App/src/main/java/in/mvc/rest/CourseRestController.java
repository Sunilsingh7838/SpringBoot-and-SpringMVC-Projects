package in.mvc.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CourseRestController {

	@GetMapping("/course")
	private ResponseEntity<String> getCourseFee(@RequestParam("cname")String cname, @RequestParam("tname") String tname){
		String respbody = cname + " By "+tname +"Fee is 7000";
		
		return new ResponseEntity<>(respbody,HttpStatus.OK);
		
	}
}
