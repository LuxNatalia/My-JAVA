package org.telbot.telran.info.repository;

//1 Extend from JpaRepository
//2 Create methods necessary написать методы, если они необходимы

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.telbot.telran.info.model.Channel;

import javax.persistence.criteria.CriteriaBuilder;
import java.util.List;

@Repository
public interface ChannelRepository extends JpaRepository<Channel, Integer> {

    List<Channel> findAll();

}
