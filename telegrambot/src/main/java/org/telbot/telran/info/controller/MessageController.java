package org.telbot.telran.info.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.telbot.telran.info.model.Message;
import org.telbot.telran.info.service.MessageService;


import java.util.List;

@RestController
@RequestMapping("/messages")
public class MessageController {
    @Autowired
    private MessageService messageService;

    @GetMapping
    public List<Message> list(){
        List<Message> messages = messageService.list();
        return messages;
    }

    @PostMapping
    public Object create(Message message) {
        Object entity = MessageService.create(message.getTitle(), message.getMessageId(), message.getText());
        return entity;
    }
}
