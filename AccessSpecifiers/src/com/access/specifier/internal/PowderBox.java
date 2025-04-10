package com.access.specifier.internal;

public class PowderBox {

    public PowderBox() {
        System.out.println("PowderBox constructor is running");
    }

    public void accessPowder() {
        Powder1 powder1 = new Powder1();
        powder1.apply();
        powder1.sprinkle();
    }
}
