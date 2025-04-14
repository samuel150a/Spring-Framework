package com.samuel.work;

public class ElectricRoff95 extends Roff95 {
    public ElectricRoff95() {
        System.out.println("Running in the ElectricRoff95 constructor");
    }

    @Override
    public void use() {
        System.out.println("Running public method use by child class");
    }

    public void charge() {
        System.out.println("Running in public method charge");
    }
}
