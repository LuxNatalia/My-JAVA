package org.telbot.telran.info.model;

import javax.persistence.*;

@Entity
@Table(name = "userChannel")// создаем таблицу в БД*/
public class UserChannel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name="userId")
    private int userId;
    @Column(name="channelId")
    private int channelId;
    @Column(name="isOn")
    private boolean isOn;

    public UserChannel(UserChannel userChannel) {
        //
    }

    public UserChannel(int userId, int channelId) {
        this.userId = userId;
        this.channelId = channelId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getChannelId() {
        return channelId;
    }

    public void setChannelId(int channelId) {
        this.channelId = channelId;
    }

    public boolean getIsOn() {
        return isOn;
    }

    public void setIsOn(boolean isOn) {
        this.isOn = isOn;
    }

}
