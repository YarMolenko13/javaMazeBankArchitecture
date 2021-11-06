package com.techstroy.documents.cards;

public abstract class Card {

    String bankName;
    int CVC;
    String cardOwnerName;
    String cardOwnerSurname;

    public Card(String bankName, int CVC, String cardOwnerName, String cardOwnerSurname) {
        this.bankName = bankName;
        this.CVC = CVC;
        this.cardOwnerName = cardOwnerName;
        this.cardOwnerSurname = cardOwnerSurname;
    }
}
