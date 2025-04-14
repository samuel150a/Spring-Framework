package com.samuel.work;

public class SoftPillow74 extends Pillow74 {
    public SoftPillow74() {
        System.out.println("Running in the SoftPillow74 constructor");
    }

    @Override
    public void use() {
        System.out.println("Running public method use by child class");
    }

    public void fluff() {
        System.out.println("Running in public method fluff");
    }
}
