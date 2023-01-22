package org.telbot.telran.info.service;

import org.telbot.telran.info.model.Channel;
import org.telbot.telran.info.model.User;
import org.telbot.telran.info.model.UserChannel;

import java.util.List;
import java.util.Optional;

public interface UserChannelService {

    List<UserChannel> list();

    List<UserChannel> listByUser(User user);

    List<UserChannel> listByChannel(Channel channel);

    UserChannel update(UserChannel userChannel);

    Optional<UserChannel> getUserChannel(int id);

    UserChannel addUserChannel(UserChannel userChannel);

    List<Channel> listChannelByUser(User user);

    UserChannel addUserChannel(User user, Channel channel);

    List<UserChannel> list(User user);

    void makeSubscriptionOn(int userChannelId);

    void makeSubscriptionOff(int userChannelId);

  /*  UserChannel addSubskription(User user, Channel channel);
    List<UserChannel> findAll();
    List<UserChannel> findAllByUserId(int userId);
    List<UserChannel> findAllByChannelId(int channelId);
    List<UserChannel> findBy(User user);
    List<UserChannel> findBy(Channel channel);
    List<Channel> findAllChannelByUser(User user);
    List<User> findAllUserByChannel(Channel channel);*/




    // List<Channel> findAllChannelByUser(User user);
  /*  List<UserChannel> list(User user);

    UserChannel create (User user, Channel channel);

    void delete(int id);*/

/*
* void addSubscription(User user, Channel channel);
*
*
* */
}
