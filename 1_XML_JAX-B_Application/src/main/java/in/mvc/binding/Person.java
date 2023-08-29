package in.mvc.binding;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorOrder;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
@XmlAccessorOrder
public class Person {
	
	private Integer Id;
	
	private String Name;
	
	@XmlTransient         // to skip a variable in marshalling.
	private Integer Age;
	
	@XmlElement(name = "Contact_no.")  // renameing
	private int phno;
	
	@XmlAttribute
	private String Type;
	
	public String getType() {
		return Type;
	}


	public void setType(String type) {
		Type = type;
	}


	private Address address;

	
	public Address getAddress() {
		return address;
	}


	public void setAddress(Address address) {
		this.address = address;
	}


	public Integer getId() {
		return Id;
	}


	public void setId(Integer id) {
		Id = id;
	}


	public String getName() {
		return Name;
	}


	public void setName(String name) {
		Name = name;
	}


	public Integer getAge() {
		return Age;
	}


	public void setAge(Integer age) {
		Age = age;
	}


	public int getPhno() {
		return phno;
	}


	public void setPhno(int phno) {
		this.phno = phno;
	}


	@Override
	public String toString() {
		return "Person [Id=" + Id + ", Name=" + Name + ", Age=" + Age + ", phno=" + phno + ", Type=" + Type
				+ ", address=" + address + "]";
	}



	
	

}
