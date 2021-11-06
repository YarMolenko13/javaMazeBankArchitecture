package com.techstroy.ticket;

import com.techstroy.client.Client;

public abstract class Ticket {
    int id;
    Client client;

    public Ticket(int id, Client client) {
        this.id = id;
        this.client = client;
    }

    public int getId() {
        return id;
    }

    public Client getClient() {
        return client;
    }
}
