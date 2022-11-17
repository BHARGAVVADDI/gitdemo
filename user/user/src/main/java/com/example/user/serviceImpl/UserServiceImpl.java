package com.example.user.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.example.user.entity.Users;
import com.example.user.repository.UserRepository;
import com.example.user.service.UserService;
import com.example.user.valueobjects.Department;
import com.example.user.valueobjects.ResponseTemplateVo;
@Service
public class UserServiceImpl implements UserService{
@Autowired
UserRepository userRepo;
@Autowired
RestTemplate restTemplate;
@Override
public Users saveUser(Users user) {
	
	return userRepo.save(user);
}

@Override
public ResponseTemplateVo getUserWithDepartmentId(Long userId) {
	// TODO Auto-generated method stub
	ResponseTemplateVo vo = new ResponseTemplateVo();
     Users user = userRepo.findByUserId(userId);

     Department department =
    		 restTemplate.getForObject("http://DEPARTMENT-SERVICE/department/getById/" + user.getDepartmentId()
                     ,Department.class);

     vo.setUser(user);
     vo.setDepartment(department);

     return  vo;
 }
}
