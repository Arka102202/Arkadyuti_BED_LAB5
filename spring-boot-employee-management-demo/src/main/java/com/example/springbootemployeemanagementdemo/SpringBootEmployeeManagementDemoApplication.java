package com.example.springbootemployeemanagementdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@SpringBootApplication
@EnableAspectJAutoProxy(proxyTargetClass = true)
public class SpringBootEmployeeManagementDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootEmployeeManagementDemoApplication.class, args);
	}

}
