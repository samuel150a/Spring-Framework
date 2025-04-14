package com.samuel.work;

public class RunnerCream58 {
    public static void main(String[] args) {
        Cream58 cream = new Cream58();
        cream.apply(); // PARENT CLASS METHOD

        Cream58 sunscreen = new Sunscreen58();
        sunscreen.apply(); // RUNTIME POLYMORPHISM

        Sunscreen58 screen = new Sunscreen58();
        screen.apply(); // CHILD CLASS METHOD
        screen.protectFromSun();

        CosmeticStore store = new CosmeticStore();
        store.show(cream);
        store.show(screen);
    }
}
