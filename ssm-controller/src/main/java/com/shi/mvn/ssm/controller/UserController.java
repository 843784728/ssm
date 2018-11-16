package com.shi.mvn.ssm.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.shi.mvn.ssm.pojo.User;
import com.shi.mvn.ssm.service.UserService;

@Controller
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@RequestMapping(value="login",method=RequestMethod.POST)
	public String login(User user,HttpServletRequest req) {
		
		User currentUser = this.userService.login(user);
		if(currentUser == null) {
			req.setAttribute("message", "用户名或者密码错误");
			return "login";
		}
		
		req.getSession().setAttribute("currentUser", currentUser);
		return "redirect:/success.jsp";
	}
	@RequestMapping(value="getUser",method=RequestMethod.GET)
	public String getUser(@RequestParam("user_id")int userId,Model model) {
		
		User user = this.userService.getUserById(userId);
		model.addAttribute("userInfo", user);
		return "user_info";
	}
	
}
