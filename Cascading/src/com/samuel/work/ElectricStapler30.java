package com.samuel.work;

public class ElectricStapler30 extends Stapler30 {
    public ElectricStapler30() {
        System.out.println("Running in the ElectricStapler30 constructor");
    }

    @Override
    public void staple() {
        System.out.println("Running public method staple by child class");
    }

    public void autoStaple() {
        System.out.println("Running in public method autoStaple");
    }
}
