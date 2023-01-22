package org.telbot.telran.info.repository;

//1 Extend from JpaRepository
//2 Create methods necessary написать методы, если они необходимы

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.telbot.telran.info.model.Channel;
import org.telbot.telran.info.model.User;

import java.util.List;
import java.util.Map;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

    List<User> findAll();
}
