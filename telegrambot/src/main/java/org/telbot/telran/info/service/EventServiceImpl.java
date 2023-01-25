package org.telbot.telran.info.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;
import org.telbot.telran.info.model.Event;
import org.telbot.telran.info.model.Message;
import org.telbot.telran.info.model.User;
import org.telbot.telran.info.model.UserChannel;
import org.telbot.telran.info.repository.MessageRepository;
import org.telbot.telran.info.repository.UserChannelRepository;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Service
public class EventServiceImpl implements EventService {
    //получить евенты для пользователя

    @Autowired
    private MessageRepository messageRepository;

    @Autowired
    UserChannelRepository userChannelRepository;



    @Scheduled(fixedRate = 10000) //property @scheduled(cron="${cron.scheduler.expression}")
    //@scheduled(fixedRATEstring="${fixed.interval.time}")
    //fixed.interval.time=60000
    public void createNewEvents(User user) {
        List<Message> allNewMessages = messageRepository.findAllByIsNew(true);
        List<UserChannel> allChannelsByUser = userChannelRepository.findAllByUserId(user.getId());
        List<Integer> allChannelIdByUser = allChannelsByUser.stream().map(s -> s.getChannelId()).collect(Collectors.toList());
        Map<Long, List<Message>> messagesForUserByChat = allNewMessages.stream().filter(m -> allChannelIdByUser.contains(m.getChatId())).collect(Collectors.groupingBy(Message::getChatId));

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
