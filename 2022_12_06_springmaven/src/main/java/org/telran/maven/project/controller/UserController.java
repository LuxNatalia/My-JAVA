package org.telran.maven.project.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.telran.maven.project.model.User;
import org.telran.maven.project.service.UserService;
import org.telran.maven.project.service.UserServiceImpl;

@Controller
public class UserController {
 //   private UserService userService=new UserServiceImpl(); //без спринга

    @Autowired
    private UserService userService;

    public User getUser(){
        return userService.getUser();

    }

}
