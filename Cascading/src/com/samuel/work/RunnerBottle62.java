package com.samuel.work;

public class RunnerBottle62 {
    public static void main(String[] args) {
        Bottle62 bottle = new Bottle62();
        bottle.fill(); // PARENT CLASS METHOD

        Bottle62 water = new WaterBottle62();
        water.fill(); // RUNTIME POLYMORPHISM

        WaterBottle62 wb = new WaterBottle62();
        wb.fill(); // CHILD CLASS METHOD
        wb.drink();

        BottleStore store = new BottleStore();
        store.show(bottle);
        store.show(wb);
    }
}
