package com.gsj.web.controller;

import com.gsj.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import com.gsj.pojo.Users;

@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/addUser")
   public String addUser(Users user){
       this.userService.addUser(user);
       return "ok";
   }
}
