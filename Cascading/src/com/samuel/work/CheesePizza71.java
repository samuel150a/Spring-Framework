package com.samuel.work;

public class CheesePizza71 extends Pizza71 {
    public CheesePizza71() {
        System.out.println("Running in the CheesePizza71 constructor");
    }

    @Override
    public void bake() {
        System.out.println("Running public method bake by child class");
    }

    public void addCheese() {
        System.out.println("Running in public method addCheese");
    }
}
