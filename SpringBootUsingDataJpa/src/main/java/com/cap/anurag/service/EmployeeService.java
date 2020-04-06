package com.cap.anurag.service;

import java.util.List;
import java.util.Optional;

import com.cap.anurag.entity.Employee;

public interface EmployeeService {

	Employee createEmployee(Employee emp) ;
	
   
    List<Employee> findAllEmployees();
    
    Employee updateEmployee(Employee emp);
	
	Employee getEmployeeById(Integer empId);


	String deleteEmployeeById(Long id);
	}

