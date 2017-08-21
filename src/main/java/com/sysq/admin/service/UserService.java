package com.sysq.admin.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.sysq.admin.model.User;

@Service
public interface UserService {

	public List<User> list();
}
