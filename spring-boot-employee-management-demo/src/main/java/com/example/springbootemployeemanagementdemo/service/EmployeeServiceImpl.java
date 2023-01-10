package com.example.springbootemployeemanagementdemo.service;

import com.example.springbootemployeemanagementdemo.entity.Employee;
import com.example.springbootemployeemanagementdemo.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class EmployeeServiceImpl implements EmployeeService {
	
	@Autowired
	EmployeeRepository employeeRepository;

	@Override
	public List<Employee> getAllEmployees() {
		return employeeRepository.findAll();
	}

	@Override
	public void saveEmployee(Employee employee) {
		employeeRepository.save(employee);
		
	}

	@Override
	public void deleteEmployeeById(int id) {
		employeeRepository.deleteById(id);
		
	}

	@Override
	public Employee getEmployeeById(int id) {
		Optional<Employee> result = employeeRepository.findById(id);
		if(result.isPresent()) {
			return result.get();
		}else {
			throw new RuntimeException("Book does not exists for Id : "+id);
		}
	}
	
}