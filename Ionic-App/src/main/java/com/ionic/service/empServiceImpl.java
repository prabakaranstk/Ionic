package com.ionic.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import com.ionic.models.empDetails;
import com.ionic.repository.empDetailsRepository;

@Service
public class empServiceImpl implements empService{

	
	 @Autowired
	 empDetailsRepository empDetailRepo;
	 


	
	@Override
	public Page<empDetails> listAllByPage(Pageable pageable) {
		return empDetailRepo.findAll(pageable);
	}




	@Override
	public void saveEmp(empDetails empd) {
		
		empDetailRepo.save(empd);
	}





	
}
