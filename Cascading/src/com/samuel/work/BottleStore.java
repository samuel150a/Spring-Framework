package com.samuel.work;

public class BottleStore {
    public BottleStore() {
        System.out.println("Running the BottleStore constructor");
    }

    public void show(Bottle62 bottle) {
        if (bottle != null) {
            bottle.fill();
            if (bottle instanceof WaterBottle62) {
                WaterBottle62 ref = (WaterBottle62) bottle;
                ref.drink();
            } else {
                System.out.println("Bottle62 is not an instance of WaterBottle62, cannot call cascaded method");
            }
        } else {
            System.out.println("Bottle62 is null");
        }
    }
}
