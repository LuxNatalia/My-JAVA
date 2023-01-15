package org.telbot.telran.info.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.telbot.telran.info.model.Channel;
import org.telbot.telran.info.model.User;
import org.telbot.telran.info.service.UserServiсe;

import java.util.List;
import java.util.Optional;
//1. Make class as rest controller
//2. Implements method
//3. Write annotation (@Autowired, @GetMapping etc.... )

@RestController
@RequestMapping("/tgUsers")
public class UserController {

   @Autowired
    private UserServiсe userService;

    @GetMapping
    public List<User> list(){
        return userService.list();
    }

    @GetMapping
    public Optional<User> getUser(int id){
        return userService.getUser(id);
    }

    @PostMapping
    public User createUser(User user){
        User entity = userService.create(user);
        return entity;
    }

    @PutMapping
    public User update(User user) {
        User userEntity=userService.update(user);
        return userEntity;
    }

    @DeleteMapping
    public void deleteUser(int id){
        userService.delete(id);
    }

}
