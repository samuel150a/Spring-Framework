package com.access.specifier.internal;

public class Card {

    public Card() {
        System.out.println("Card constructor is running");
    }

    public void swipe() {
        System.out.println("public method swipe is running");
    }

    void tap() {
        System.out.println("default method tap is running");
    }

    private void block() {
        System.out.println("private method block is running");
    }
}
