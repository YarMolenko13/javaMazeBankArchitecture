package com.techstroy.documents.cards;

import java.util.Random;

public class DebitCard extends Card{
    /** Рандомное число от 0 до 100000 */
    double balance;

    public DebitCard(String bankName, int CVC, String cardOwnerName, String cardOwnerSurname) {
        super(bankName, CVC, cardOwnerName, cardOwnerSurname);
        Random random = new Random();
        this.balance = random.nextDouble(0.0, 100000.0);
    }
}
