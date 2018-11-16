package com.shi.mvn.ssm.service;

import com.shi.mvn.ssm.pojo.User;

public interface UserService {
	User login(User user);
	User getUserById(int userId);
}
