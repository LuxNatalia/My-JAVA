package org.telbot.telran.info.service;

import org.telbot.telran.info.model.Event;
import org.telbot.telran.info.model.User;

import java.util.List;

public interface EventService {

    List<Event> getNewEventsByUser(User user);

}
