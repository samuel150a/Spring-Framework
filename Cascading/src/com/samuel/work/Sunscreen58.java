package com.samuel.work;

public class Sunscreen58 extends Cream58 {
    public Sunscreen58() {
        System.out.println("Running in the Sunscreen58 constructor");
    }

    @Override
    public void apply() {
        System.out.println("Running public method apply by child class");
    }

    public void protectFromSun() {
        System.out.println("Running in public method protectFromSun");
    }
}
