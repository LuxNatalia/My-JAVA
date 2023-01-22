package org.telbot.telran.info.service;

import org.telbot.telran.info.model.Message;

import java.util.List;

public interface MessageService {
   List<org.telegram.telegrambots.meta.api.objects.Message> list();
    Object create(Message message);

}
