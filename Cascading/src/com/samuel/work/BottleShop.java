package com.samuel.work;

public class BottleShop {
    public BottleShop() {
        System.out.println("Running the BottleShop constructor");
    }

    public void show(Bottle5 bottle) {
        if (bottle != null) {
            bottle.useBottle();
            if (bottle instanceof WaterBottle5) {
                WaterBottle5 ref = (WaterBottle5) bottle;
                ref.fillWater();
            } else {
                System.out.println("Bottle5 is not an instance of WaterBottle5, cannot call cascaded method");
            }
        } else {
            System.out.println("Bottle5 is null");
        }
    }
}
