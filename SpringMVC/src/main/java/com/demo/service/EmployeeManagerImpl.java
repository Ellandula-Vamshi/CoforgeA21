package com.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.model.Employee;

@Service
public class EmployeeManagerImpl implements  EmployeeManager {

	@Autowired
	Employee emp;

	public List<Employee> getAllEmployee() 
	{
		
		return emp.getAllEmployee();
	}

}
