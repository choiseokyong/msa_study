package com.msatwo.user.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.msatwo.user.model.UserVO;
@Mapper
public interface UserMapper {
    List<UserVO> selectUserList();
    void insertUser(String id,String name);
    UserVO selectById(String id);
    void deleteUser(String id);
    void updateUser(String id,String name);
}
