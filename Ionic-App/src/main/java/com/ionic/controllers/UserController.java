package com.ionic.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ionic.models.UserDetails;
import com.ionic.service.userService;



@RestController
public class UserController {
	
	
	 private final userService userService;
	
	public UserController(userService userService){
		 
		 this.userService=userService; 
	}
	
	@CrossOrigin
	 @RequestMapping(value="api/getuser",method=RequestMethod.GET)
	 Page<UserDetails> list( Pageable pageable){
			Page<UserDetails> userD = userService.listAllByPage(pageable);
			return userD;
		} 
	  
	
}