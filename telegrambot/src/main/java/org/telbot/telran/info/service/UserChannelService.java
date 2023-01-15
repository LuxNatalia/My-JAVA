package org.telbot.telran.info.service;

import org.telbot.telran.info.model.Channel;
import org.telbot.telran.info.model.User;
import org.telbot.telran.info.model.UserChannel;

import java.util.List;
import java.util.Optional;

public interface UserChannelService {
    List<UserChannel> list(User user);

    UserChannel create (User user, Channel channel);

    void delete(int id);


}
