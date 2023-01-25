package org.telbot.telran.info.service;

import org.telbot.telran.info.model.Message;

import java.util.List;

public interface MessageService {

    static Message create(String title, Long messageId, String text) {
        return null;
    }


    List<Message> list();
/*
    static Object create(Message message){
        return null;
    };

    Object create(Message message);
*/

}
