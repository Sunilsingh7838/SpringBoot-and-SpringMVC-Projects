package org.composite.service;

import java.io.File;
import java.io.FileInputStream;
import java.nio.file.Files;
import java.nio.file.Paths;

import org.composite.entity.User;
import org.composite.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

	@Autowired
	private UserRepository userRepo;
	
	public void saveUser() throws Exception {
		
		String imagePath = "C:\\Users\\SUNIL\\Desktop\\MY CV DOCS\\sun.jpg";
		
		User u1 = new User();
		u1.setUserName("Smith");
		u1.setUserEmail("Smith@gmail.com");
		
		long size = Files.size(Paths.get(imagePath));
		
		byte[] arr = new byte[(int)size];
		FileInputStream fis = new FileInputStream(new File(imagePath));
		fis.read(arr);
		fis.close();
		u1.setUserImage(arr);
		
		userRepo.save(u1);
	}
	
}
