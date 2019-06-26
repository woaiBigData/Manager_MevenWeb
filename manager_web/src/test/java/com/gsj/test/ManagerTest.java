package com.gsj.test;

import com.gsj.mapper.UserMapper;
import com.gsj.pojo.Users;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring/applicationContext-dao.xml")

public class ManagerTest {

    @Autowired(required = false)
    private UserMapper userMapper;

    @Test
    public void insertUserTest(){
        Users users=new Users();
        users.setId(5);
        users.setUsername("admin");
        users.setUserage(23);
        this.userMapper.insertUser(users);
    }
}
