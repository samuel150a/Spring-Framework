package com.samuel.work;

public class FineTipBrush40 extends PaintBrush40 {
    public FineTipBrush40() {
        System.out.println("Running in the FineTipBrush40 constructor");
    }

    @Override
    public void paint() {
        System.out.println("Running public method paint by child class");
    }

    public void addDetails() {
        System.out.println("Running in public method addDetails");
    }
}
