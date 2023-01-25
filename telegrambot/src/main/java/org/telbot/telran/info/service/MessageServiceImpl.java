package org.telbot.telran.info.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import org.telbot.telran.info.model.Message;
import org.telbot.telran.info.repository.MessageRepository;


import java.util.List;

@Service
public class MessageServiceImpl implements MessageService {

    @Autowired
    private MessageRepository messageRepository;
    private Message message;

    @Override
    public List<Message> list() {
        return messageRepository.findAll();

    }
    static Message create(String title, Long chatId, String text) {
        return new Message(title, chatId, text);
    }

/*
    @Override
    public Object create(Message message) {
        return null;
    }

    @Override
    public Object create(Message message) {
        this.message = message;
        Object entity;
        entity = messageRepository.save(new Message(message));
        return entity;
    }*/
}
