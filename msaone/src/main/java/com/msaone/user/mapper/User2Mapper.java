package com.msaone.user.mapper;

import java.util.ArrayList;

import org.apache.ibatis.annotations.Mapper;

import com.msaone.user.model.UserVO;

@Mapper
public interface User2Mapper {
	UserVO selectById(String id);
	ArrayList<UserVO> selectUserList();
	void insertUser(String id, String name);
	void deleteUser(String id);
	void updateUser(String id, String name);
}
