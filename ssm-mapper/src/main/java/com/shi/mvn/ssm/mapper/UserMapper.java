package com.shi.mvn.ssm.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.shi.mvn.ssm.pojo.User;

public interface UserMapper {
	
	User select(int userId);
	
	User selectUser(@Param("userName")String userName,@Param("password")String password);
}
