package com.samuel.work;

public class ColdCococola69 extends Cococola69 {
    public ColdCococola69() {
        System.out.println("Running in the ColdCococola69 constructor");
    }

    @Override
    public void serve() {
        System.out.println("Running public method serve by child class");
    }

    public void addIce() {
        System.out.println("Running in public method addIce");
    }
}
