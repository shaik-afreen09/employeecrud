package com.cap.anurag.dao;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cap.anurag.entity.Employee;

 


@Repository
public interface Mydaorepository extends JpaRepository<Employee, Integer> {

	Optional<Employee> findById(Integer Id);

	Optional<Employee> findById(Long id);

	void deleteById(Long id);

	//Optional<Employee> findById(Long id);

	

	

	
	


	

	
}