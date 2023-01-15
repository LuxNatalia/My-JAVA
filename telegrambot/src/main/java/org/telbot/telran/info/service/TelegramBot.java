package org.telbot.telran.info.service;

import org.springframework.stereotype.Service;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.objects.Update;
@Service
public class TelegramBot extends TelegramLongPollingBot {
    @Override
    public String getBotUsername() {
        return "  bot";
    }

    @Override
    public String getBotToken() {
        return "  ";
    }

    @Override
    public void onUpdateReceived(Update update) { //перехватывает сообщения

    }
}
