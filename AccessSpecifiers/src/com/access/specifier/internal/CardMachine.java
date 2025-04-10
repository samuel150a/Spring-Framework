package com.access.specifier.internal;

public class CardMachine {

    public CardMachine() {
        System.out.println("CardMachine constructor is running");
    }

    public void accessCard() {
        Card card = new Card();
        card.swipe();
        card.tap();
    }
}
