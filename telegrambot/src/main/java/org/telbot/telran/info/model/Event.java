package org.telbot.telran.info.model;

import javax.persistence.Entity;
import javax.persistence.Table;

/*@Entity
@Table(name="event")// создаем таблицу в БД*/
public class Event {

    int userId;
    int chatId;
    int numberOfMessages;
    boolean isNew;




    //пользователь
    //канал
    //дата создания
    //....
    //true-false
}
