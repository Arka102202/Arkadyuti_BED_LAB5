package com.example.springbootemployeemanagementdemo.repository;

import com.example.springbootemployeemanagementdemo.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer>{

}