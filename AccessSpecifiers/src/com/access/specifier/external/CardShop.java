package com.access.specifier.external;

import com.access.specifier.internal.Card;

public class CardShop {

    public CardShop() {
        System.out.println("CardShop constructor is running");
    }

    public void displayCard() {
        Card card = new Card();
        card.swipe();
    }
}
