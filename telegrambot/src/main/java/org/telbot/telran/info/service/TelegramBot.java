package org.telbot.telran.info.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.objects.Chat;
import org.telegram.telegrambots.meta.api.objects.Message;
import org.telegram.telegrambots.meta.api.objects.Update;

@Service
public class TelegramBot extends TelegramLongPollingBot implements Switchable {

    private boolean enabled = false;

    @Value("")  //default
    private String botName;

    @Value(" ") // default
    private String token;

    @Autowired
    private CommandService commandService;

    @Autowired
    private MessageService messageService;

    @Override
    public String getBotUsername() {
        return "LuksikBot";
    }

    @Override
    public String getBotToken() {
        return "5945828450:AAEBsFqO3RYS86hM-ZXLITNNAnKU7Nf8_5o";
    }

    @Override
    public void onUpdateReceived(Update update) { //перехватывает сообщения

        if (update.getMessage().isCommand()) {
            commandService.executeCommand(update.getMessage().getText(), this);
            return;
        }

        if (!enabled) {
            //log //"TelegramBot is off. Reading is off"
            return;
        }


        Message message = update.getMessage();
        messageService.create(update.getMessage());

        Chat chat = message.getChat();
        if (chat.isGroupChat()) {
            Long chatId = message.getChatId();
            String text = message.getText();
            String title = chat.getTitle();

        }
    }


    @Override
    public void on() {
        enabled = true;
    }

    @Override
    public void off() {
        enabled = false;
    }
}
