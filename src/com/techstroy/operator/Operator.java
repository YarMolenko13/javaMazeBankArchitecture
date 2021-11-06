package com.techstroy.operator;

import com.techstroy.client.Client;
import com.techstroy.ticket.Ticket;
import com.techstroy.utils.Utils;
import com.techstroy.window.Window;

import java.io.PrintStream;
import java.util.List;

public class Operator {
    private final PrintStream out = System.out;

    private final Window window;

    public Operator(Window window) {
        this.window = window;
    }

    public void callClient() {
        if (Utils.isBeforeDinner()) {
            List<Ticket> tickets = window.getApplyForVisaTickets();
            Client client = tickets.get(0).getClient();

            out.println(client.toString());

            tickets.remove(0);
            window.setApplyForVisaTickets(tickets);
        } else {
            List<Ticket> tickets = window.getReceiveCertificateTickets();
            Client client = tickets.get(0).getClient();

            out.println(client.toString());

            tickets.remove(0);
            window.setReceiveCertificateTickets(tickets);
        }
    }
}
