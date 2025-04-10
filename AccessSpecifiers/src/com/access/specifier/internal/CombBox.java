package com.access.specifier.internal;

public class CombBox {

    public CombBox() {
        System.out.println("CombBox constructor is running");
    }

    public void accessComb() {
        Comb comb = new Comb();
        comb.strength();
        comb.angle();
    }
}
