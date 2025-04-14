package com.samuel.work;

public class RunnerCup73 {
    public static void main(String[] args) {
        Cup73 cup = new Cup73();
        cup.drink(); // PARENT CLASS METHOD

        Cup73 mug = new Mug73();
        mug.drink(); // RUNTIME POLYMORPHISM

        Mug73 mug73 = new Mug73();
        mug73.drink(); // CHILD CLASS METHOD
        mug73.handle();

        BeverageShop shop = new BeverageShop();
        shop.show(cup);
        shop.show(mug73);
    }
}
