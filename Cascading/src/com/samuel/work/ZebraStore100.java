package com.samuel.work;

public class ZebraStore100 {
    public ZebraStore100() {
        System.out.println("Running the ZebraStore100 constructor");
    }

    public void show(Zebra100 zebra) {
        if (zebra != null) {
            zebra.run();
            if (zebra instanceof WildZebra100) {
                WildZebra100 ref = (WildZebra100) zebra;
                ref.graze();
            } else {
                System.out.println("Zebra100 is not an instance of WildZebra100, cannot call cascaded method");
            }
        } else {
            System.out.println("Zebra100 is null");
        }
    }
}
