package org.telbot.telran.info.controller;

// связать пользователя и каналы, сделать подписку. И наоборот, удалить каналы
// вывести список каналов пользователя

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.telbot.telran.info.model.Channel;
import org.telbot.telran.info.model.User;
import org.telbot.telran.info.model.UserChannel;
import org.telbot.telran.info.service.UserChannelService;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/userChannel")
public class UserChannelController {
    //Public API
    //1. list channels for user
    //2. add subscription for user подписку
    //3. remove subscription for user

    @Autowired(required = false)
    private UserChannelService userChannelService;

    @GetMapping
    public List<UserChannel> list() {
        return userChannelService.list();
    }
    @GetMapping("/{user}")
    public List<UserChannel> listByUser(@PathVariable (name = "user") User user) {
        return userChannelService.listByUser(user);
    }
    @GetMapping("/{channel}")
    public List<UserChannel> listByChannel(@PathVariable (name = "channel") Channel channel) {
        return userChannelService.listByChannel(channel);
    }
    @GetMapping("/{channelByUser}")
    public List<Channel> listChannelByUser(@PathVariable(name="channelByUser") User user) {
    return userChannelService.listChannelByUser(user);
    }

    @PutMapping
    public UserChannel update(UserChannel userChannel) {
        return userChannelService.update(userChannel);
    }

    @GetMapping("/{id}")
    public Optional<UserChannel> getUserChannel(@PathVariable(name="id") int id) {
        return  userChannelService.getUserChannel(id);
            }

    @PostMapping
    public UserChannel addUserChannel(@RequestBody UserChannel userChannel) {
        return  userChannelService.addUserChannel(userChannel);

    }


}
