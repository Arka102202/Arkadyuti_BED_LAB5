package com.example.springbootemployeemanagementdemo.controller;

import com.example.springbootemployeemanagementdemo.entity.Employee;
import com.example.springbootemployeemanagementdemo.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/employees")
public class EmployeeController {
	
	@Autowired
	EmployeeService employeeService;
	
	@GetMapping("/list")
	public String getEmployees(Model model) {
		List<Employee> employees = employeeService.getAllEmployees();
		model.addAttribute("employees", employees);
		return "employees";
	}
	
	@GetMapping("/new")
	public String showAddForm(Model model) {
		Employee employee = new Employee();
		model.addAttribute("employee", employee);
		model.addAttribute("flag", "create");
		return "create-update-employee";
	}
	
	@GetMapping("/edit/{id}")
	public String showUpdateForm(Model model,@PathVariable("id") int id) {
		Employee employee = employeeService.getEmployeeById(id);
		model.addAttribute("employee", employee);
		model.addAttribute("flag", "update");
		return "create-update-employee";
	}

	@GetMapping("/delete/{id}")
	public String delete(@PathVariable("id") int id) {
		employeeService.deleteEmployeeById(id);
		return "redirect:/employees/list";
	}
	@PostMapping("/save")
	public String save(@ModelAttribute("employee") Employee employee) {
		employeeService.saveEmployee(employee);
		return "redirect:/employees/list";
	}
}