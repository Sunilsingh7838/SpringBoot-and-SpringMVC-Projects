package in.mvc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RestApi5CrudAppApplication {

//    @Bean
//    public Docket api(){
//		return new Docket(DocumentationType.SWAGGER_2).select()
//				.apis(RequestHandlerSelectors.withClassAnnotation(RestController.class))
//				.paths(PathSelectors.any())
//				.build()
//				.apiInfo(apiInfo())
//				.useDefaultResponseMessages(false);
//	}
//
//    @Bean
//    public ApiInfo apiInfo() {
//		final ApiInfoBuilder builder = new ApiInfoBuilder();
//		return builder.build();
//	}
	
	public static void main(String[] args) {
		SpringApplication.run(RestApi5CrudAppApplication.class, args);
	}

}
