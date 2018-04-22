package com.ionic.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ionic.models.UserDetails;
import com.ionic.models.empDetails;
import com.ionic.service.empService;
import com.ionic.service.userService;



@RestController
public class UserController {
	
	
	 private final userService userService;
	
	 private final empService empService;
	 
	public UserController(userService userService,empService empService){
		 
		 this.userService=userService;
		 this.empService=empService;
	}
	
	@CrossOrigin
	 @RequestMapping(value="api/getuser",method=RequestMethod.GET)
	 Page<UserDetails> list( Pageable pageable){
			Page<UserDetails> userD = userService.listAllByPage(pageable);
			return userD;
		} 
	  
	
	@CrossOrigin
	  @RequestMapping(method=RequestMethod.POST, value="app/addemp")
	    public String save(@RequestBody empDetails empDetails) {
	      
		  
		  
		  System.out.println("emp name-----"+empDetails.getEmp_name());
		  
		  empService.saveEmp(empDetails);
		  
	        return "OK";
	    }
	
	
	
	
	
}