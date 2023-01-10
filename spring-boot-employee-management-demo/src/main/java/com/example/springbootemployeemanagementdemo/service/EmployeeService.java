package com.example.springbootemployeemanagementdemo.service;

import com.example.springbootemployeemanagementdemo.entity.Employee;

import java.util.List;


public interface EmployeeService {
	
	public List<Employee> getAllEmployees();
	public void saveEmployee(Employee employee);
	public void deleteEmployeeById(int id);
	public Employee getEmployeeById(int id);

}