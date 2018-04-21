package com.ionic.service;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.ionic.models.UserDetails;

public interface userService {
	
	

	 Page<UserDetails> listAllByPage(Pageable pageable);
	 
	 
	 
}
