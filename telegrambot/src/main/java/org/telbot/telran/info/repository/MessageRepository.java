package org.telbot.telran.info.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.telegram.telegrambots.meta.api.objects.Message;

import javax.persistence.Id;
import java.util.List;

@Repository
public interface MessageRepository extends JpaRepository{
    List<Message> findAll();
    List<Message> findAllByUserId();

}
