package com.access.specifier.internal;

public class CoinCounter {

    public CoinCounter() {
        System.out.println("CoinCounter constructor is running");
    }

    public void accessCoin() {
        Coin coin = new Coin();
        coin.flip();
        coin.toss();
    }
}
