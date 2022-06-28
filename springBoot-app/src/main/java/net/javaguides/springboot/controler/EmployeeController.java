package net.javaguides.springboot.controler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import antlr.collections.List;
import net.javaguides.springboot.model.Employee;
import net.javaguides.springboot.repsitory.EmployeeRepository;

@RestController
@RequestMapping("/api/v1/")
public class EmployeeController{
	
	@Autowired
	private EmployeeRepository employeeRepository;

	//get all employes
	
	@GetMapping("/employess")
	public List  getAllEmployees(){
		return (List) employeeRepository.findAll();
				
	}
}
