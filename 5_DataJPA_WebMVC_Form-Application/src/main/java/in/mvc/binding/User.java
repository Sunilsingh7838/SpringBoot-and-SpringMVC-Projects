package in.mvc.binding;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public class User {

	@NotEmpty(message = "Uname is required!")
	@Size(min = 3 ,max = 8 , message = " Username should be 3-8 characters.")
	private String uname;
	
	@NotEmpty(message = "Password is required!")
	private String pwd;
	
	@NotEmpty(message = "Email is required!")
	@Email(message = "Enter valid Email!")
	private String email;
	
	@NotEmpty(message = "Phone no. is required!")
	@Size(min = 10, message = "Phone no. should has atleast 10 digits!")
	private String phno;
	
	@NotNull(message = "Age is required!")
	@Min(value = 21, message = "Age should be minimum 21 years!")
	@Max(value = 60,message = "Age should be maximun 60 years!")
	private Integer age;

	public String getUname() {
		return uname;
	}

	public void setUname(String uname) {
		this.uname = uname;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhno() {
		return phno;
	}

	public void setPhno(String phno) {
		this.phno = phno;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}
	
}
