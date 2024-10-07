package org.jsp.first_sb;

import org.jsp.first_sb.repository.UserRepository;

import org.jsp.pms.responsestructure.ResponseStructure;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
	
	@Autowired
	UserRepository repository;
	
	
	
	@PostMapping ("/users")
	public ResponseStructure<User> saveUser(@RequestBody User user) {
		
		 repository.save(user);
		 ResponseStructure<User> structure =new ResponseStructure<>();
		 
	
		 
		 
		return structure;
		 
		 
	} 
	
}
