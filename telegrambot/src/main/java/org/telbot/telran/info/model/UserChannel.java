package org.telbot.telran.info.model;

import javax.persistence.*;

@Entity
@Table(name="userChannel")// создаем таблицу в БД
public class UserChannel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private User user;
    private Channel channel;

    public UserChannel(User user, Channel channel) {
        this.user = user;
        this.channel = channel;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Channel getChannel() {
        return channel;
    }

    public void setChannel(Channel channel) {
        this.channel = channel;
    }
}
