package com.access.specifier.external;

import com.access.specifier.internal.Coin;

public class CoinValue {

    public CoinValue() {
        System.out.println("CoinValue constructor is running");
    }

    public void secondAccessing() {
        Coin coin = new Coin();
        coin.flip();
    }
}
