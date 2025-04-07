package com.msaone.board.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.msaone.board.mapper.UserMapper;
import com.msaone.board.model.UserVO;

@Service
public class UserService {
	@Autowired
	public UserMapper userMapper;
	
	public UserVO getUser(String id) {
		return userMapper.selectById(id);
	}
	
	public ArrayList<UserVO> getUserList() {
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
