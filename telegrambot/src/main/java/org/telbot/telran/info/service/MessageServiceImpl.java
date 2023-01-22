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

    @Override
    public List<org.telegram.telegrambots.meta.api.objects.Message> list() {
        return messageRepository.findAll();

    }

    @Override
    public Object create(Message message) {
        Object entity;
        entity = messageRepository.save(new Message(message));
        return entity;
    }
}
