package com.techstroy;

import com.techstroy.client.Client;

import com.techstroy.documents.cards.Card;
import com.techstroy.documents.cards.DebitCard;
import com.techstroy.operator.Operator;
import com.techstroy.terminal.Terminal;
import com.techstroy.utils.Utils;
import com.techstroy.window.Window;


public class Main {

    public static void main(String[] args) {
        Window window = new Window();
        Operator operator = new Operator(window);
        Terminal terminal = new Terminal(window);

        // client 1
        Client clientIaroslav = Utils.generateMockClient();

        // client 2
        Card debitCardVika = new DebitCard("Tinkoff", 114,
                "Victoria", "Morgunova");
        Client clientVika = new Client("Victoria", new Card[]{debitCardVika});

        // client 3
        Client clientPavel = new Client("Pavel");

        terminal.applyForVisa(clientIaroslav);
        terminal.applyForVisa(clientVika);
        terminal.receiveCertificate(clientPavel);

        window.display();

        operator.callClient();
    }
}
