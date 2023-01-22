package org.telbot.telran.info.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="tg_user")// создаем таблицу в БД
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name="name")
    private String name;

        public User() {
        //
    }

    public User(String name) {
        this.name = name;
    }


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
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
        return "User " + id +" " + name ;
    }
}
