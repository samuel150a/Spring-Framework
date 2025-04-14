package com.samuel.work;

public class RunnerZebra100 {
    public static void main(String[] args) {
        Zebra100 zebra = new Zebra100();
        zebra.run(); // PARENT CLASS METHOD

        Zebra100 wildZebra = new WildZebra100();
        wildZebra.run(); // RUNTIME POLYMORPHISM

        WildZebra100 wz = new WildZebra100();
        wz.run(); // CHILD CLASS METHOD
        wz.graze();

        ZebraStore100 store = new ZebraStore100();
        store.show(zebra);
        store.show(wz);
    }
}
