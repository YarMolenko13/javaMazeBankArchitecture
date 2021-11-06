package com.techstroy.terminal;

import com.techstroy.client.Client;
import com.techstroy.ticket.Ticket;
import com.techstroy.ticket.TicketApplyForVisa;
import com.techstroy.ticket.TicketReceiveCertificate;
import com.techstroy.utils.Utils;
import com.techstroy.window.Window;

import java.io.PrintStream;

public class Terminal {
    private final PrintStream out = System.out;

    private final Window window;
    /** Id для следующего site */
    private int ticketId = 1;

    public Terminal(Window window) {
        this.window = window;
    }

    public void applyForVisa(Client client) {
        if (!Utils.isBeforeDinner()) {
            String msg = "!!! " + client.getName() + ", failed to leave a request because after lunch, the center works only in the mode of issuing certificates.\n " +
                    "Please come back later !!!\n";
            out.println(msg);
            return;
        }

        Ticket ticket = new TicketApplyForVisa(ticketId, client);
        ticketId++;

        window.addApplyForVisaTicket(ticket);
    }

    public void receiveCertificate(Client client) {
        if (Utils.isBeforeDinner()) {
            String msg = "!!! " + client.getName()  + ", failed to leave a request because after lunch, the center works only in the mode of applying Visa.\n " +
                    "Please come back later !!!\n";
            out.println(msg);
            return;
        }

        Ticket ticket = new TicketReceiveCertificate(ticketId, client);
        ticketId++;

        window.addReceiveCertificateTicket(ticket);
    }
}
