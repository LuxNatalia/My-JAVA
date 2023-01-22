package org.telbot.telran.info.service;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;
import org.telbot.telran.info.model.Event;
import org.telbot.telran.info.model.User;

import java.util.List;

@Service
public class EventServiceImpl implements EventService {
    //получить евенты для пользователя
    @Scheduled(fixedRate = 10000) //property @scheduled(cron="${cron.scheduler.expression}")
    //@scheduled(fixedRATEstring="${fixed.interval.time}")
    //fixed.interval.time=60000

    public void createNewEvents(){

        //Get all new message
        //Get all user with channel
        //For every channel create event for user who subscribe on this channel
        //new event store to database

    }

    @Override
    public List<Event> getNewEventsByUser(User user) {
        return null;
    }
}
