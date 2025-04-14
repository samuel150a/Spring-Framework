package com.samuel.work;

public class RunnerCrackers68 {
    public static void main(String[] args) {
        Crackers68 crackers = new Crackers68();
        crackers.explode(); // PARENT CLASS METHOD

        Crackers68 fancy = new FancyCrackers68();
        fancy.explode(); // RUNTIME POLYMORPHISM

        FancyCrackers68 fc = new FancyCrackers68();
        fc.explode(); // CHILD CLASS METHOD
        fc.sparkle();

        CrackerShop shop = new CrackerShop();
        shop.show(crackers);
        shop.show(fc);
    }
}
