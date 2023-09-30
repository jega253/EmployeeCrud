package com.Employee.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.Employee.dto.Employee;
import com.Employee.repo.EmployeeRepo;

@RestController
public class Controller {
	
	@Autowired
	EmployeeRepo employeeRepo;
	
	@GetMapping("/getempbyid/{id}")
	public Optional<Employee> getbyid(@PathVariable Integer id) {
		return employeeRepo.findById(id);
	}
	
	@PostMapping("/save")
	public void save(@RequestBody Employee employee){
		employeeRepo.save(employee);
	}
	@DeleteMapping("/delete/{id}")
	public void deleById(@PathVariable Integer id){
		employeeRepo.deleteById(id);
	}
	@GetMapping("/findall")
	public List<Employee> allemployee(){
		return employeeRepo.findAll();
	}
	@DeleteMapping("/deleteall")
	public void deleteall() {
		employeeRepo.deleteAll();
	}
}
