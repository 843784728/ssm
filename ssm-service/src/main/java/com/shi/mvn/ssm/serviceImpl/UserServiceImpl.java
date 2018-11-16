package com.shi.mvn.ssm.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shi.mvn.ssm.mapper.UserMapper;
import com.shi.mvn.ssm.pojo.User;
import com.shi.mvn.ssm.service.UserService;
@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserMapper userMapper;
	public User login(User user) {
		return this.userMapper.selectUser(user.getUserName(), user.getPassword());
	}

	public User getUserById(int userId) {
		// TODO Auto-generated method stub
		return this.userMapper.select(userId);
	}
	
	

}
