package com.cap.anurag.service;

import java.util.List;
import java.util.Optional;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.cap.anurag.dao.Mydaorepository;
import com.cap.anurag.entity.Employee;

@Service
@Transactional
public class EmployeeServiceImplementation implements EmployeeService {
@Autowired

Mydaorepository empDao;

public Employee createEmployee(Employee emp)
{
	return empDao.save(emp);
	
}
public  Employee updateEmployee(Employee emp){
	return empDao.save(emp);
	
}


/*public Employee getEmployeeById(Long id) 
{
    Optional<Employee> employee = empDao.findById(id);
     
    if(employee.isPresent()) 
    {
        return employee.get();
    } /*else {
        throw new RecordNotFoundException("No employee record exist for given id");
    }
    return employee.get();
}*/


@Override
public List<Employee> findAllEmployees() {
	return empDao.findAll();
}
/*
@Override
public void deleteEmployeeByempId(Integer empId) {
	// TODO Auto-generated method stub
	Optional<Employee> employee = empDao.findByempId(empId);
    
    if(employee.isPresent()) 
    {
        empDao.deleteByempId(empId);
    } else {
        //
    	empDao.deleteByempId(empId);
    	//throw new RecordNotFoundException("No employee record exist for given id");
    }
	
}
@Override
public Employee getEmployeeByempId(Integer empId) {
	// TODO Auto-generated method stub
	
	Optional<Employee> employee = empDao.findByempId(empId);
    
    if(employee.isPresent()) {
        return employee.get();
    } else {
    	
    	return employee.get();
        //throw new RecordNotFoundException("No employee record exist for given id");
    }
	

}

*/
@Override
public Employee getEmployeeById(Integer empId) 
{
	// TODO Auto-generated method stub
Optional<Employee> employee = empDao.findById(empId);
    
    if(employee.isPresent())
    {
        return employee.get();
    } else
    {
    	
    	return employee.get();
}
}
@Override
public String deleteEmployeeById(Long id) 
{
	// TODO Auto-generated method stub
	
	    Optional<Employee> employee = empDao.findById(id);
         
        if(employee.isPresent()) 
        {
            empDao.deleteById(id);
            return "deleted successfully";
        } else {
            //throw new RecordNotFoundException("No employee record exist for given id");
            return "no records to delete";
        }
		
	
}
}
