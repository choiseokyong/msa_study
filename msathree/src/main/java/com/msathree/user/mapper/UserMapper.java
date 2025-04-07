package com.msathree.user.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.msathree.user.model.UserVO;
@Mapper
public interface UserMapper {
    List<UserVO> selectUserList();
    void insertUser(String id,String name);
    UserVO selectById(String id);
    void deleteUser(String id);
    void updateUser(String id,String name);
}
