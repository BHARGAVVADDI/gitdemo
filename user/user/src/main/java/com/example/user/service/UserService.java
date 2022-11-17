package com.example.user.service;

import com.example.user.entity.Users;
import com.example.user.valueobjects.ResponseTemplateVo;

public interface UserService {

	Users saveUser(Users user);

	ResponseTemplateVo getUserWithDepartmentId(Long userId);

	
	
}
