package com.sysq.admin.controller;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.sysq.admin.model.User;
import com.sysq.admin.service.UserService;

@Controller
@RequestMapping("/user")
public class UserController {

	@Resource(name="userService")
	UserService userSerivce;
	
	@ResponseBody
	@RequestMapping("/list")
	public String list(HttpServletRequest req, HttpServletResponse res){
		List<User> list = userSerivce.list();
		
		for (User user : list) {
			System.out.println(user.getId());
		}
		return "/admin/user";
	}
}
