package org.telbot.telran.info.model;

import javax.persistence.*;

@Entity
@Table(name="message")
public class Message {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int messageId;
    @Column(name="title")
    String title;
    @Column(name="chat_id")
    Long chatId;
    @Column(name="text")
    String text;
    @Column(name = "is_new")
    boolean isNew;

    public Message(org.telegram.telegrambots.meta.api.objects.Message message) {
        //
    }

    public Message(String title, Long chatId, String text) {
        this.title = title;
        this.chatId = chatId;
        this.text = text;
    }

    public int getMessageId() {
        return messageId;
    }

    public void setMessageId(int messageId) {
        this.messageId = messageId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Long getChatId() {
        return chatId;
    }

    public void setChatId(Long chatId) {
        this.chatId = chatId;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public boolean isNew() {
        return isNew;
    }

    public void setNew(boolean aNew) {
        isNew = aNew;
    }

}
