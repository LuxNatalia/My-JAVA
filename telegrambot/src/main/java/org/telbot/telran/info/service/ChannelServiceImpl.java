package org.telbot.telran.info.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.telbot.telran.info.model.Channel;
import org.telbot.telran.info.repository.ChannelRepository;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

@Service
public class ChannelServiceImpl implements ChannelService {

    @Autowired
    private ChannelRepository channelRepository;


    @Override
    public List<Channel> list() {
        return channelRepository.findAll();
    }

    @Override
    public Channel create(Channel channel) {
        Channel entity = channelRepository.save(channel); //поле id=null
        return entity; //возвращает уже с объектом базы данных. с id
    }

    @Override
    public Channel update(Channel channel) {
        Channel channelEntity=channelRepository.findById(channel.getId()).get();
        channel.setName(channel.getName()==null ? channelEntity.getName(): channel.getName());
        Channel entity=channelRepository.save(channel);
        return entity;
    }

    @Override
    public void delete(int id) {
       // List<Channel> channelList = channelRepository.findAll().stream().filter(s -> s.getId() != id).collect(Collectors.toList());
        channelRepository.deleteById(id);

    }

    @Override
    public Optional<Channel> getChannel(Integer id) {
        Optional<Channel> channel = channelRepository.findById(id);

        return channel;
    }
}
