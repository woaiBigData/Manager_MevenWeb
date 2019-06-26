package com.gsj.service.impl;

import com.gsj.mapper.UserMapper;
import com.gsj.pojo.Users;
import com.gsj.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper UsersMapper;
    @Override
    public void addUser(Users users) {
       this.UsersMapper.insertUser(users);
    }
}
