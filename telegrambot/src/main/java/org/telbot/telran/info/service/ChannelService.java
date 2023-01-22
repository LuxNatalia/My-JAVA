package org.telbot.telran.info.service;

import org.telbot.telran.info.model.Channel;

import java.util.List;
import java.util.Optional;


//1. Made implementation this interface
//2. Create methods


public interface ChannelService {

    List<Channel> list();

    Channel create(Channel channel);

    Channel update(Channel channel);

    void delete(int id);

    Optional<Channel> getChannel(Integer id);

    Channel create(String name, long channelId);
}
