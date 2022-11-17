package com.example.departmentservice.seviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.departmentservice.entity.Department;
import com.example.departmentservice.repository.DepartmentRepository;
import com.example.departmentservice.service.DepartmentService;
@Service
public class DepartmentServiceImpl implements DepartmentService{

	@Autowired
	DepartmentRepository departmentRepo;
	

	@Override
	public Department saveDepartment(Department department) {
		// TODO Auto-generated method stub
		return departmentRepo.save(department);
	}
@Override
public List<Department> getDepartment() {
	return departmentRepo.findAll();
}
@Override
public Department getDepartmentById(Long departmentId) {
	// TODO Auto-generated method stub
	return departmentRepo.findByDepartmentId(departmentId);
}
}