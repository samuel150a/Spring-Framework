package com.samuel.work;

public class InkPen4 extends Pen4 {
    public InkPen4() {
        System.out.println("Running in the InkPen4 constructor");
    }

    @Override
    public void write() {
        System.out.println("Running public method write by child class");
    }

    public void refillInk() {
        System.out.println("Running in public method refillInk");
    }
}
