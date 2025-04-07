package com.msaone.user.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.msaone.user.mapper.User2Mapper;
import com.msaone.user.model.UserVO;

@Service
public class User2Service {
	@Autowired
	public User2Mapper userMapper;
	
	public UserVO getUser(String id) {
		return userMapper.selectById(id);
	}
	
	public ArrayList getUserList() {
		return userMapper.selectUserList();
	}
	
	public void saveUser(String id, String name) {
		userMapper.insertUser(id, name);
	}
	
	public void deleteUser(String id) {
		userMapper.deleteUser(id);
	}
	
	public void updateUser(String id, String name) {
		userMapper.updateUser(id, name);
	}
}
