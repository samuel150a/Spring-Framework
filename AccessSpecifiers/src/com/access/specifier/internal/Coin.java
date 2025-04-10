package com.access.specifier.internal;

public class Coin {

    public Coin() {
        System.out.println("Coin constructor is running");
    }

    public void flip() {
        System.out.println("public method flip is running");
    }

    void toss() {
        System.out.println("default method toss is running");
    }

    private void vanish() {
        System.out.println("private method vanish is running");
    }
}
