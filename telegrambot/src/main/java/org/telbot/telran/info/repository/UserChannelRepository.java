package org.telbot.telran.info.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.telbot.telran.info.model.User;
import org.telbot.telran.info.model.UserChannel;

import java.util.List;

@Repository
public interface UserChannelRepository extends JpaRepository<UserChannel, Integer> {

    List<UserChannel> findAllByUserId(int userId);

    List<UserChannel> findAll();

    List<UserChannel> findById(int id);

    List<UserChannel> findAllByChannelId(int channelId);
}
