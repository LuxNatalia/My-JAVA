package org.telbot.telran.info.controller;

// связать пользователя и каналы, сделать подписку. И наоборот, удалить каналы
// вывести список каналов пользователя

import org.opentest4j.ValueWrapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.telbot.telran.info.model.Channel;
import org.telbot.telran.info.model.User;
import org.telbot.telran.info.model.UserChannel;
import org.telbot.telran.info.service.UserChannelService;

import java.util.List;

@RestController
@RequestMapping("/userChannels")
public class UserChannelController {
    //Public API
    //1. list channels for user
    //2. add subscription for user подписку
    //3. remove subscription for user

    @Autowired(required = false)
    private UserChannelService userChannelService;

    @GetMapping
    public List<UserChannel> list(User user){
        return userChannelService.list(user);
    }

    @PostMapping
    public UserChannel createSubscription(User user, Channel channel){
        UserChannel entity = userChannelService.create(user, channel);
        return entity;
    }

    @DeleteMapping
    public void deleteSubscription(int id){
        userChannelService.delete(id);
    }

}
