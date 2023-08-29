package in.mvc.converter;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;

import in.mvc.binding.Address;
import in.mvc.binding.Person;

public class CoverterJavaToXml {
	public static void main(String[] args) throws Exception {
		
		Address addr = new Address();
		addr.setCity("Delhi Ncr");
		addr.setState("New Delhi");
		addr.setCountry("India");
		
		
		Person person = new Person();
		person.setId(101);
		person.setName("Sunil");
		person.setAge(23);
		person.setPhno(1234567);
		person.setType("Developer");
		person.setAddress(addr);
		
		 JAXBContext instance = JAXBContext.newInstance(Person.class);
		 
		 Marshaller marshaller = instance.createMarshaller();
		 marshaller.marshal(person, new File("Person.xml"));
		 
		 System.out.println("Marshalling Completed.......");
	}

}
