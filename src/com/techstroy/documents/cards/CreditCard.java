package com.techstroy.documents.cards;

import java.util.Random;

public class CreditCard extends Card {
    /** Рандомное число от 0 до 100000 */
    double limit;

    public CreditCard(String bankName, int CVC, String cardOwnerName, String cardOwnerSurname) {
        super(bankName, CVC, cardOwnerName, cardOwnerSurname);
        Random random = new Random();
        this.limit = random.nextDouble(0.0, 100000.0);
    }
}
