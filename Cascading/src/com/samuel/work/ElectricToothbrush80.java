package com.samuel.work;

public class ElectricToothbrush80 extends Toothbrush80 {
    public ElectricToothbrush80() {
        System.out.println("Running in the ElectricToothbrush80 constructor");
    }

    @Override
    public void brush() {
        System.out.println("Running public method brush by child class");
    }

    public void charge() {
        System.out.println("Running in public method charge");
    }
}
