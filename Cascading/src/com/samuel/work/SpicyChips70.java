package com.samuel.work;

public class SpicyChips70 extends Chips70 {
    public SpicyChips70() {
        System.out.println("Running in the SpicyChips70 constructor");
    }

    @Override
    public void eat() {
        System.out.println("Running public method eat by child class");
    }

    public void addMasala() {
        System.out.println("Running in public method addMasala");
    }
}
