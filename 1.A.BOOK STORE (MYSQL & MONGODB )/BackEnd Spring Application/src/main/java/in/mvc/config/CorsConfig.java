package in.mvc.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
@EnableWebMvc
public class CorsConfig implements WebMvcConfigurer {

	@Override
	public void addCorsMappings(CorsRegistry registry) {
		registry.addMapping("/api/showData")
		        .allowedOrigins("http://127.0.0.1:5500")
		        .allowedMethods("GET");
		
		registry.addMapping("/api/addData")
		        .allowedOrigins("http://127.0.0.1:5500")
		        .allowedMethods("POST");
	}
	
//		        .allowedMethods("GET", "POST", "PUT", "DELETE");
	
}
