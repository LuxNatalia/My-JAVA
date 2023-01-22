package org.telbot.telran.info.service;


//1. Made implementation this interface
//2. Create methods


import org.telbot.telran.info.model.User;

import java.util.List;
import java.util.Optional;

public interface UserServiсe {


    List<User> list();

    User update(User user);

    void delete(int id);

    Optional<User> getUser(int id);

    User create(User user);

    User create(String name);
}
