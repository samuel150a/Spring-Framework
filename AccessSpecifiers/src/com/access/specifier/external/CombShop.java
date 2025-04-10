package com.access.specifier.external;

import com.access.specifier.internal.Comb;

public class CombShop {

    public CombShop() {
        System.out.println("CombShop constructor is running");
    }

    public void displayComb() {
        Comb comb = new Comb();
        comb.strength();
    }
}
