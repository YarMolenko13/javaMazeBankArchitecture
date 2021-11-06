package com.techstroy.client;

import com.techstroy.documents.Business;
import com.techstroy.documents.Credit;
import com.techstroy.documents.Payment;
import com.techstroy.documents.cards.Card;

import java.util.Arrays;

public class Client {
    String name;
    Credit credit;
    Card[] cards;
    Payment[] payments;
    Business business;

    public Client(String name, Credit credit, Card[] cards, Payment[] payments, Business business) {
        this.name = name;
        this.credit = credit;
        this.cards = cards;
        this.payments = payments;
        this.business = business;
    }

    public Client(String name, Credit credit, Card[] cards, Payment[] payments) {
        this.name = name;
        this.credit = credit;
        this.cards = cards;
        this.payments = payments;
    }

    public Client(String name, Card[] cards) {
        this.name = name;
        this.cards = cards;
    }

    public Client(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Client{" +
                "name='" + name + '\'' +
                ", credit=" + credit +
                ", cards=" + Arrays.toString(cards) +
                ", payments=" + Arrays.toString(payments) +
                ", business=" + business +
                '}';
    }
}
