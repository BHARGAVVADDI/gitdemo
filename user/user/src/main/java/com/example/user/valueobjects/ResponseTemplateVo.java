package com.example.user.valueobjects;

import com.example.user.entity.Users;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ResponseTemplateVo {
	
private Users user;
private Department department;
public Users getUser() {
	return user;
}
public void setUser(Users user) {
	this.user = user;
}
public Department getDepartment() {
	return department;
}
public void setDepartment(Department department) {
	this.department = department;
}

}
