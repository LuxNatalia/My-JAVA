package org.telran.maven.project.service;

import org.springframework.stereotype.Service;
import org.telran.maven.project.model.User;

@Service
public class UserServiceImpl implements UserService{


    @Override
    public User getUser() {
        return new User();
    }
}
