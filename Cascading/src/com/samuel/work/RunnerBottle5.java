package com.samuel.work;

public class RunnerBottle5 {
    public static void main(String[] args) {
        Bottle5 bottle = new Bottle5();
        bottle.useBottle(); // NORMALLY ACCESSING PARENT CLASS METHOD

        Bottle5 waterBottle = new WaterBottle5();
        waterBottle.useBottle(); // RUNTIME POLYMORPHISM

        WaterBottle5 wb5 = new WaterBottle5();
        wb5.useBottle(); // NORMALLY ACCESSING CHILD CLASS METHOD
        wb5.fillWater();

        BottleShop shop = new BottleShop();
        shop.show(bottle);
        shop.show(wb5);
    }
}
