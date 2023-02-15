package org.tgbotonJAVA;

import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.api.objects.adminrights.ChatAdministratorRights;
import org.telegram.telegrambots.meta.api.objects.User;
import org.telegram.telegrambots.meta.api.objects.Message;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;
public class Bot extends TelegramLongPollingBot {
    private final String BOT_NAME = "RockPaperScissorsJAVAbot";
    private final String BOT_TOKEN = "6142588236:AAFgM2vB5Vr1eiEdMuaHVH0_BYa3yL1-jbc";

    public void RockPaperScissors(Update update) {
        if (update.hasMessage());
    }
    public String parseMessage(String textMsg) {
        String response;

        //Сравниваем текст пользователя с нашими командами, на основе этого формируем ответ
        if(textMsg.equals("/start"))
            response = "Приветствую, бот знает много цитат. Жми /get, чтобы получить случайную из них";
        else if(textMsg.equals("/rpc"))
            response = RockPaperScissors.Play();
        else
            response = "Сообщение не распознано";

        return response;
    }
    @Override
    public String getBotUsername() {
        return "RockPaperScissorsJAVAbot";
    }

    @Override
    public String getBotToken() {
        return "6142588236:AAFgM2vB5Vr1eiEdMuaHVH0_BYa3yL1-jbc";
    }
}