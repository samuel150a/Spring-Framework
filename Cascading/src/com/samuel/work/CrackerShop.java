package com.samuel.work;

public class CrackerShop {
    public CrackerShop() {
        System.out.println("Running the CrackerShop constructor");
    }

    public void show(Crackers68 crackers) {
        if (crackers != null) {
            crackers.explode();
            if (crackers instanceof FancyCrackers68) {
                FancyCrackers68 ref = (FancyCrackers68) crackers;
                ref.sparkle();
            } else {
                System.out.println("Crackers68 is not an instance of FancyCrackers68, cannot call cascaded method");
            }
        } else {
            System.out.println("Crackers68 is null");
        }
    }
}
