package org.telbot.telran.info.model;


import javax.persistence.*;

@Entity
@Table(name="channel")// создаем таблицу в БД
public class Channel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name="name")
    private String name;
    @Column(name="group_id")
    private long groupId;

    public Channel(Channel channel) {
        //
    }

    public Channel(String name, long groupId) {
        this.name = name;
        this.groupId = groupId;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public long getGroupId() {
        return groupId;
    }

    public void setGroupId(long groupId) {
        this.groupId = groupId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Channel " + id + " " + name + " " + groupId ;
    }
}
