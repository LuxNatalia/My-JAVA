package org.telbot.telran.info.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.telbot.telran.info.model.Message;

import java.util.List;

@Repository
public interface MessageRepository extends JpaRepository {
   List<Message> findAll();
   List<Message> findAllByChatId();
   List<Message> findAllByIsNew(boolean b);

}
