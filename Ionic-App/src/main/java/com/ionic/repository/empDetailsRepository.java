package com.ionic.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ionic.models.empDetails;

import org.springframework.data.repository.PagingAndSortingRepository;

@Repository
public interface empDetailsRepository extends PagingAndSortingRepository<empDetails, Long> {

	//List<UserDetails> findUserByUsername(String name);
	
}