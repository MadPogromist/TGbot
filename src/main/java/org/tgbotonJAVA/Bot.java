package org.tgbotonJAVA;

import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.api.objects.adminrights.ChatAdministratorRights;
import org.telegram.telegrambots.meta.api.objects.User;
import org.telegram.telegrambots.meta.api.objects.Message;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

import java.util.Scanner;

public class Bot extends TelegramLongPollingBot {
    private final String BOT_NAME = "RockPaperScissorsJAVAbot";
    private final String BOT_TOKEN = "6142588236:AAFgM2vB5Vr1eiEdMuaHVH0_BYa3yL1-jbc";

    @Override
    public String getBotUsername() {
        return "RockPaperScissorsJAVAbot";
    }

    @Override
    public String getBotToken() {
        return "6142588236:AAFgM2vB5Vr1eiEdMuaHVH0_BYa3yL1-jbc";
    }

    @Override
    public void onUpdateReceived(Update update) {
        try
        {
            if(update.hasMessage() && update.getMessage().hasText())
            {
                //Извлекаем из объекта сообщение пользователя
                Message inMess = update.getMessage();
                //Достаем из inMess id чата пользователя
                String chatId = inMess.getChatId().toString();
                //Получаем текст сообщения пользователя, отправляем в обработчик
                String response = parseMessage(inMess.getText());
                //Создаем объект класса SendMessage - наш будущий ответ пользователю
                SendMessage outMess = new SendMessage();

                //Добавляем в наше сообщение id чата а также наш ответ
                outMess.setChatId(chatId);
                outMess.setText(response);

                //Отправка в чат
                execute(outMess);
            }
        } catch (TelegramApiException e)
        {
            e.printStackTrace();
        }
    }
    public String parseMessage(String textMsg)
    {
        String response;

        //Сравниваем текст пользователя с нашими командами, на основе этого формируем ответ
        if(textMsg.equals("/start"))
            response = "Приветствую, данный бот еще в разработке, это мой пет-проект что бы подтянуть свои скиллы в " +
                    "программировании и я потихоньку буду допиливать его фишками";

        else if(textMsg.equals("/rpc") || textMsg.equals("Давай сыграем"))
        {
            response = "Хорошо, я пока умею только в \"камень, ножницы, бумага\" отправь мне свой вариант, например : /Scissors";
        }
        else if (textMsg.equals("Scissors") || textMsg.equals("Rock") || textMsg.equals("Paper"))
        {
            response = RockPaperScissors.Play(textMsg);
        } else if ()
        {

        } else
            response = "Сообщение не распознано";

        return response;
    }
}