package com.example.departmentservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.departmentservice.entity.Department;
import com.example.departmentservice.service.DepartmentService;

import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("/department")
@Slf4j
public class DepartmentController {
	
	@Autowired
	DepartmentService departmentService;
	@PostMapping("/save")
	public Department saveDepartment(@RequestBody Department department) {
		//log.info("inside saveDepartment method of DepartmentController");
		return departmentService.saveDepartment(department);
	}
	
	@GetMapping("/get")
	public List<Department> getDepartment() {
		return departmentService.getDepartment();
	}
	
	@GetMapping("/getById/{id}")
	public Department getDepartmentById(@PathVariable("id") Long departmentId) {
		return departmentService.getDepartmentById(departmentId);
	}

}
