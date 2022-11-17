package com.example.user.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.user.entity.Users;
import com.example.user.service.UserService;
import com.example.user.valueobjects.ResponseTemplateVo;

@RestController
@RequestMapping("/user")

public class UserController {
@Autowired
UserService userService;

@PostMapping("/save")
public Users saveUser(@RequestBody Users user) {
	return userService.saveUser(user);
}

@GetMapping("/getByDepartmentId/{id}")
public ResponseTemplateVo getUserWithDepartmentId(@PathVariable("id") Long userId) {
	return userService.getUserWithDepartmentId(userId);
}

}
