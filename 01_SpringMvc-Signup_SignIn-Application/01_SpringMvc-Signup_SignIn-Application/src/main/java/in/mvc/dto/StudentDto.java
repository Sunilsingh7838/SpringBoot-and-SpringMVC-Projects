package in.mvc.dto;

import java.util.Date;

import lombok.Data;

@Data
public class StudentDto {

	private String firstName;

	private String lastName;

	private Date doB;

	private String gender;

	private String contact;

	private String email;

	private String address;

	private String state;

	private String pinCode;

	private String country;
	
	//Login attributes
	private String userEmail;
	
	private String password;
	

}
