package com.example.departmentservice.service;

import java.util.List;

import com.example.departmentservice.entity.Department;

public interface DepartmentService {
	
List<Department> getDepartment();

Department saveDepartment(Department department); 
Department getDepartmentById(Long departmentId);
}
