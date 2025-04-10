package com.access.specifier.internal;

import com.access.specifier.internal.CardMachine;
import com.access.specifier.external.CardShop;

public class RunnerCard {
    public static void main(String[] args) {
        CardMachine cardMachine = new CardMachine();
        cardMachine.accessCard();

        CardShop cardShop = new CardShop();
        cardShop.displayCard();
    }
}

