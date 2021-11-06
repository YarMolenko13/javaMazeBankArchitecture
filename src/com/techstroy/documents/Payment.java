package com.techstroy.documents;

import java.util.Calendar;

public class Payment {
    String from;
    String to;
    Calendar date;

    public Payment(String from, String to, Calendar date) {
        this.from = from;
        this.to = to;
        this.date = date;
    }
}
