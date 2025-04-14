package com.samuel.work;

public class WoodenTable72 extends Table72 {
    public WoodenTable72() {
        System.out.println("Running in the WoodenTable72 constructor");
    }

    @Override
    public void use() {
        System.out.println("Running public method use by child class");
    }

    public void polish() {
        System.out.println("Running in public method polish");
    }
}
