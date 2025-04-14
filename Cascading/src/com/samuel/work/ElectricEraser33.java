package com.samuel.work;

public class ElectricEraser33 extends Eraser33 {
    public ElectricEraser33() {
        System.out.println("Running in the ElectricEraser33 constructor");
    }

    @Override
    public void erase() {
        System.out.println("Running public method erase by child class");
    }

    public void autoErase() {
        System.out.println("Running in public method autoErase");
    }
}
