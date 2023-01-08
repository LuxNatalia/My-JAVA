package org.boot.telran.project.service;

import org.boot.telran.project.model.User;
import org.boot.telran.project.model.dto.UserDto;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class UserServiceImpl implements UserService{

    private List<User> userList;

    @PostConstruct
    public void init(){
        userList=new ArrayList<>();
        userList.add(new User("Alex", "One"));
        userList.add(new User("Oleg", "Two"));
        userList.add(new User("Yurii", "Three"));
    }


    @Override
    public List<UserDto> getUsers() {
        return  userList.stream().map(user -> new UserDto(user.getLogin())).collect(Collectors.toList());


    }
}
