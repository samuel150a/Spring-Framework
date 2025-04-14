package com.samuel.work;

public class BeverageShop {
    public BeverageShop() {
        System.out.println("Running the BeverageShop constructor");
    }

    public void show(Cup73 cup) {
        if (cup != null) {
            cup.drink();
            if (cup instanceof Mug73) {
                Mug73 ref = (Mug73) cup;
                ref.handle();
            } else {
                System.out.println("Cup73 is not an instance of Mug73, cannot call cascaded method");
            }
        } else {
            System.out.println("Cup73 is null");
        }
    }
}
