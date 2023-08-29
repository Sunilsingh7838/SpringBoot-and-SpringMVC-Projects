package org.composite.entity;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

@Entity
public class Passport {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer passportId;
	
	private String passportNum;
	
	private Date issueDate;
	
	private Date expiryDate;
	
	@OneToOne
	@JoinColumn(name = "person_id")
	private Person person;

	public Integer getPassportId() {
		return passportId;
	}

	public void setPassportId(Integer passportId) {
		this.passportId = passportId;
	}

	public String getPassportNum() {
		return passportNum;
	}

	public void setPassportNum(String passportNum) {
		this.passportNum = passportNum;
	}

	public Date getIssueDate() {
		return issueDate;
	}

	public void setIssueDate(Date issueDate) {
		this.issueDate = issueDate;
	}

	public Date getExpiryDate() {
		return expiryDate;
	}

	public void setExpiryDate(Date expiryDate) {
		this.expiryDate = expiryDate;
	}

	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}

	
}
