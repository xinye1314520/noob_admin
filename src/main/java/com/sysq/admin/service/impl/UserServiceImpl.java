package com.sysq.admin.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.sysq.admin.dao.UserDao;
import com.sysq.admin.model.User;
import com.sysq.admin.service.UserService;

@Service("userService")
public class UserServiceImpl implements UserService{

	@Resource(name="userDao")
	UserDao userDao;
	
	@Override
	public List<User> list() {
		
		return userDao.list();
	}

}
