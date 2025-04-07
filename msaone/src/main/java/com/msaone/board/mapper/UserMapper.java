package com.msaone.board.mapper;

import java.util.ArrayList;

import org.apache.ibatis.annotations.Mapper;

import com.msaone.board.model.UserVO;

@Mapper
public interface UserMapper {
	UserVO selectById(String id);
	ArrayList<UserVO> selectUserList();
	void insertUser(String id, String name);
	void deleteUser(String id);
	void updateUser(String id, String name);
}
