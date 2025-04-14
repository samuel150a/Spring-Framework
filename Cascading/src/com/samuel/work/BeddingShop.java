package com.samuel.work;

public class BeddingShop {
    public BeddingShop() {
        System.out.println("Running the BeddingShop constructor");
    }

    public void show(Blanket75 blanket) {
        if (blanket != null) {
            blanket.use();
            if (blanket instanceof WoolBlanket75) {
                WoolBlanket75 ref = (WoolBlanket75) blanket;
                ref.warmUp();
            } else {
                System.out.println("Blanket75 is not an instance of WoolBlanket75, cannot call cascaded method");
            }
        } else {
            System.out.println("Blanket75 is null");
        }
    }
}
