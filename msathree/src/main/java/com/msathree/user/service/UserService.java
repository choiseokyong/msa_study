package com.msathree.user.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.msathree.user.mapper.UserMapper;
import com.msathree.user.model.UserVO;

@Service
public class UserService {
	@Autowired
    public UserMapper userMapper;
	

	 public List<UserVO> getUserList() {
	        return userMapper.selectUserList();
	    }
	 public void saveUser(String id, String name) {
         userMapper.insertUser(id,name);
    }
	 public UserVO getUser(String id) {
	        return userMapper.selectById(id);
	    }
	 public void deleteUser(String id) {
	        userMapper.deleteUser(id);
	   }
	 
	  public void updateUser(String id, String name) {
	        userMapper.updateUser(id,name);
	   }
}
