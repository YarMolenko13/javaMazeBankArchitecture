package com.techstroy.window;

import com.techstroy.ticket.Ticket;
import com.techstroy.utils.Utils;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

public class Window {
    private final PrintStream out = System.out;

    List<Ticket> applyForVisaTickets = new ArrayList<>();
    List<Ticket> receiveCertificateTickets = new ArrayList<>();

    public void addApplyForVisaTicket(Ticket ticket) {
        applyForVisaTickets.add(ticket);
    }

    public void addReceiveCertificateTicket(Ticket ticket) {
        receiveCertificateTickets.add(ticket);
    }

    public String parseTickets(List<Ticket> tickets) {
        String msg = "";
        for (int i = 0; i < tickets.size(); i++) {
            int AVERAGE_WAITING_MIN = 5;
            msg += String.format(
                    "Ticket: %d || %s \n",
                    tickets.get(i).getId(),
                    i * AVERAGE_WAITING_MIN);
        }
        return msg;
    }

    public void display() {
        String msg = "";
        if (Utils.isBeforeDinner()) {
            msg = parseTickets(applyForVisaTickets);
        } else {
            msg = parseTickets(receiveCertificateTickets);
        }
        out.println(msg);
    }

    public List<Ticket> getApplyForVisaTickets() {
        return applyForVisaTickets;
    }

    public void setApplyForVisaTickets(List<Ticket> applyForVisaTickets) {
        this.applyForVisaTickets = applyForVisaTickets;
    }

    public List<Ticket> getReceiveCertificateTickets() {
        return receiveCertificateTickets;
    }

    public void setReceiveCertificateTickets(List<Ticket> receiveCertificateTickets) {
        this.receiveCertificateTickets = receiveCertificateTickets;
    }
}
