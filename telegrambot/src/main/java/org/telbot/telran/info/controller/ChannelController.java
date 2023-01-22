package org.telbot.telran.info.controller;

//1. Make class as rest controller
//2.Implement all methods
//3. Annotation

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.telbot.telran.info.model.Channel;
import org.telbot.telran.info.service.ChannelService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/channels")
public class ChannelController {

    @Autowired
    private ChannelService channelService;

    @GetMapping
    public List<Channel> list(){
      return channelService.list();
    }

    @PostMapping("/channel")
    public Channel create(String name, long channelId) {
        Channel entity = channelService.create(name, channelId);
        return entity;
    }
    @PutMapping
    public Channel update(Channel channel) {
        Channel channelEntity=channelService.update(channel);
        return channelEntity;
    }

    @DeleteMapping
    public void delete(int id){
        channelService.delete(id);

    }
    @GetMapping("/channel")
    public Optional<Channel> getChannel(Integer id){
        return channelService.getChannel(id);

    }


}
