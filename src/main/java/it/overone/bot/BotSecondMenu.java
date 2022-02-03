package it.overone.bot;

import org.telegram.telegrambots.meta.api.objects.replykeyboard.InlineKeyboardMarkup;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.InlineKeyboardButton;

import java.util.ArrayList;
import java.util.List;

public class BotSecondMenu {

    //    Кнопка меню
    public static InlineKeyboardMarkup sendSecondMenu() {
        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        InlineKeyboardButton inlineKeyboardButton1 = new InlineKeyboardButton();
        InlineKeyboardButton inlineKeyboardButton2 = new InlineKeyboardButton();
        InlineKeyboardButton inlineKeyboardButton3 = new InlineKeyboardButton();
        InlineKeyboardButton inlineKeyboardButton4 = new InlineKeyboardButton();
        InlineKeyboardButton inlineKeyboardButton5 = new InlineKeyboardButton();

        inlineKeyboardButton1.setText("Мои соседи");
        inlineKeyboardButton1.setCallbackData("Button neighbor");

        inlineKeyboardButton2.setText("Барахолка");
        inlineKeyboardButton2.setCallbackData("Button baraholka");

        inlineKeyboardButton3.setText("ЖКХ");
        inlineKeyboardButton3.setCallbackData("Button JKH");

        inlineKeyboardButton4.setText("Кто подпер?");
        inlineKeyboardButton4.setCallbackData("Button breaker");

        inlineKeyboardButton5.setText("Справка");
        inlineKeyboardButton5.setCallbackData("Button reference");

        List<InlineKeyboardButton> inlineKeyboardButtons1 = new ArrayList<>();
        inlineKeyboardButtons1.add(inlineKeyboardButton1);
        inlineKeyboardButtons1.add(inlineKeyboardButton2);
        inlineKeyboardButtons1.add(inlineKeyboardButton3);

        List<InlineKeyboardButton> inlineKeyboardButtons2 = new ArrayList<>();
        inlineKeyboardButtons2.add(inlineKeyboardButton4);
        inlineKeyboardButtons2.add(inlineKeyboardButton5);

        List<List<InlineKeyboardButton>> rowList = new ArrayList<>();
        rowList.add(inlineKeyboardButtons1);
        rowList.add(inlineKeyboardButtons2);
        inlineKeyboardMarkup.setKeyboard(rowList);
        return inlineKeyboardMarkup;

    }

}
