package org.boot.telran.project.controller;

import org.boot.telran.project.model.User;
import org.boot.telran.project.model.dto.UserDto;
import org.boot.telran.project.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/userlist")
public class UserController {
    //localhost:8080/userlist - набрать в адресной строке, чтобы попасть в контроллер

  /*  @GetMapping
    public String getAddres(){
        return "Address";
    }*/
    @Autowired
    private UserService userService;

    @GetMapping
    public List<UserDto> List() {
        return userService.getUsers();

    }


}
