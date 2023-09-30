package com.Employee.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Employee.dto.Employee;

public interface EmployeeRepo extends JpaRepository<Employee, Integer> {
	
}
