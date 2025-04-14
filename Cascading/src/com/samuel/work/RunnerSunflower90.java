package com.samuel.work;

public class RunnerSunflower90 {
    public static void main(String[] args) {
        Sunflower90 sunflower = new Sunflower90();
        sunflower.bloom(); // PARENT CLASS METHOD

        Sunflower90 yellowSunflower = new YellowSunflower90();
        yellowSunflower.bloom(); // RUNTIME POLYMORPHISM

        YellowSunflower90 ys = new YellowSunflower90();
        ys.bloom(); // CHILD CLASS METHOD
        ys.grow();

        FlowerShop shop = new FlowerShop();
        shop.show(sunflower);
        shop.show(ys);
    }
}
