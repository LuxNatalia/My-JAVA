package org.telbot.telran.info.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.telbot.telran.info.model.Message;

import java.util.List;

@Repository
public interface TelegramMessageRepository extends JpaRepository {
   List<Message> findAll();
   List<Message> findAllByChatId();

}
