package com.ionic.service;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.ionic.models.empDetails;

public interface empService {
	
	

	 Page<empDetails> listAllByPage(Pageable pageable);
	 
	 void saveEmp(empDetails empd);
	 
}
