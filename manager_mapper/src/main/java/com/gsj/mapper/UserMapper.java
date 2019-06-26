package com.gsj.mapper;

import com.gsj.pojo.Users;

import java.util.List;


public interface UserMapper {
    void insertUser(Users user);
    List<Users> selectUserAll();
}
