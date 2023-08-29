package org.app.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
//import lombok.AllArgsConstructor;
//import lombok.Data;
//import lombok.NoArgsConstructor;

@Entity
@Table(name = "USER_MASTER")
//@Data             // no need to generate setters & getters and toString methods.
//@NoArgsConstructor // means 0 param constructor // lombok will generate all.
//@AllArgsConstructor // parameterised constructor // will generated automatically.
public class User {

	public User() {
		// TODO Auto-generated constructor stub
	}

	@Id
	@Column(name = "USER_ID")
	private Integer userId;
	
	@Column(name = "USER_NAME")
	private String userName;
	
	@Column(name = "USER_GENDER")
	private String Gender;
	
	@Column(name = "USER_AGE")
	private Integer age;
	
	@Column(name = "USER_COUNTRY")
	private String country;

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getGender() {
		return Gender;
	}

	public void setGender(String gender) {
		Gender = gender;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	@Override
	public String toString() {
		return "User [userId=" + userId + ", userName=" + userName + ", Gender=" + Gender + ", age=" + age
				+ ", country=" + country + "]";
	}

	
	
	
	
	
}
