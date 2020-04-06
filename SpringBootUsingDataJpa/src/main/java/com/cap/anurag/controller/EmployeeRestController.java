package com.cap.anurag.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cap.anurag.entity.Employee;
import com.cap.anurag.service.EmployeeService;

@RestController
@RequestMapping("/bank")
@CrossOrigin("http://localhost:4981")
public class EmployeeRestController {

	@Autowired
	EmployeeService empService;
	
	//*************************
	@PostMapping("/CreateAccount")
	public String createAccount(@RequestBody Employee emp)
	{
		Employee employee=empService.createEmployee(emp);
		if(employee==null)
			
		{
			return "Insertion Failed!!!!!";
		}
		else
		{
			return "Inserted the record Successfully!!!!!!";
		}
		
	}
	
	//*************************
	@GetMapping("/findById/{empId}")
	public ResponseEntity<Employee> getEmployeeById(@PathVariable Integer empId)
	{
		
		Employee entity = empService.getEmployeeById(empId);
		 
        return new ResponseEntity<Employee>(entity, new HttpHeaders(), HttpStatus.OK);
		

	}
	
	//*************************
	@GetMapping("/ListAllEmployees")
	public List<Employee> findAllEmployees()
	{
		return empService.findAllEmployees();
	}
	
	//*************************
	@PutMapping("/updateEmp")
	public String updateEmp(@RequestBody Employee emp)
	{
		Employee emp1= empService.updateEmployee(emp);
		if(emp1!=null)
		{
			return "updated the records Successfully as ";
		}
		else
		{
			return "employee details not updated";
		}
		
	}
	
	//*************************
    @DeleteMapping("/deleteEmpById/{empId}")
    public String deleteEmployeeById(@PathVariable("id") Long id) 
    {
      return empService.deleteEmployeeById(id);
      
}
  }



