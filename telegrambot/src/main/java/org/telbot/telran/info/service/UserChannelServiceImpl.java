package org.telbot.telran.info.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.telbot.telran.info.model.Channel;
import org.telbot.telran.info.model.User;
import org.telbot.telran.info.model.UserChannel;
import org.telbot.telran.info.repository.ChannelRepository;
import org.telbot.telran.info.repository.UserChannelRepository;
import org.telbot.telran.info.repository.UserRepository;

import java.util.Collections;
import java.util.List;

public class UserChannelServiceImpl implements UserChannelService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private ChannelRepository channelRepository;

    @Autowired
    private UserChannelRepository userChannelRepository;

    @Override
    public List<UserChannel> list(User user) {
        return userChannelRepository.findBy(user);
    }

    @Override
    public UserChannel create(User user, Channel channel) {
        UserChannel entity= new UserChannel(user, channel);  //не получается без new
        userChannelRepository.save(entity);
        return entity;
    }

    @Override
    public void delete(int id) {
        userChannelRepository.deleteById(id);
    }
}
