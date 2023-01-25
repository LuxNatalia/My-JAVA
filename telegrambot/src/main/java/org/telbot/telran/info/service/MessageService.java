package org.telbot.telran.info.service;

import org.telbot.telran.info.model.Message;

import java.util.List;

public interface MessageService {
   List<Message> list();
    static Object create(Message message);

    Object create(Message message);

    Object create(Message message);
}
