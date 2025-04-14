package com.samuel.work;

public class RunnerPillow74 {
    public static void main(String[] args) {
        Pillow74 pillow = new Pillow74();
        pillow.use(); // PARENT CLASS METHOD

        Pillow74 softPillow = new SoftPillow74();
        softPillow.use(); // RUNTIME POLYMORPHISM

        SoftPillow74 sp = new SoftPillow74();
        sp.use(); // CHILD CLASS METHOD
        sp.fluff();

        PillowShop shop = new PillowShop();
        shop.show(pillow);
        shop.show(sp);
    }
}
