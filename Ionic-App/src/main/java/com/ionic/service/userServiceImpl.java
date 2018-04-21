package com.ionic.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import com.ionic.models.UserDetails;
import com.ionic.repository.userDetailsRepository;

@Service
public class userServiceImpl implements userService{

	
	 @Autowired
	 userDetailsRepository userDetailRepo;
	 


	
	@Override
	public Page<UserDetails> listAllByPage(Pageable pageable) {
		return userDetailRepo.findAll(pageable);
	}





	
}
