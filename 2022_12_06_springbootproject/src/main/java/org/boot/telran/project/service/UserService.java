package org.boot.telran.project.service;

import org.boot.telran.project.model.User;
import org.boot.telran.project.model.dto.UserDto;

import java.util.List;

public interface UserService {
    List<UserDto> getUsers();
}
