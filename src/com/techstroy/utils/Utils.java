package com.techstroy.utils;

import com.techstroy.client.Client;
import com.techstroy.documents.Business;
import com.techstroy.documents.Credit;
import com.techstroy.documents.Payment;
import com.techstroy.documents.cards.Card;
import com.techstroy.documents.cards.CreditCard;
import com.techstroy.documents.cards.DebitCard;

import java.time.LocalTime;
import java.util.Calendar;

public class Utils {

    private static final int DINNER_TIME_H = 13;

    public static boolean isBeforeDinner() {
        LocalTime now = LocalTime.now();
        return now.getHour() < DINNER_TIME_H;
    }

    public static Client generateMockClient() {
        // документы клиента (для теста)
        Business businessFastFood = new Business("Iaroslav", "Fast&Tasty");
        Card debitTinkoff = new DebitCard("Tinkoff", 553, "Iaroslav", "Molodtsov");
        Card creditAlfa = new CreditCard("AlfaBank", 390, "Iaroslav", "Molodtsov");
        Payment payment1 = new Payment("Iaroslav", "Max", Calendar.getInstance());
        Payment payment2 = new Payment("Andrey", "Iaroslav", Calendar.getInstance());
        Payment[] payments = new Payment[]{payment1, payment2};
        Credit creditIaroslav = new Credit("Iaroslav", "Molodtsov", 530013.0);
        return new Client("Iaroslav", creditIaroslav, new Card[]{debitTinkoff, creditAlfa}, payments, businessFastFood);
    }
}
