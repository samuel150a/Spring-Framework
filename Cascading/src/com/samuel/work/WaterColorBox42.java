package com.samuel.work;

public class WaterColorBox42 extends ColorBox42 {
    public WaterColorBox42() {
        System.out.println("Running in the WaterColorBox42 constructor");
    }

    @Override
    public void openBox() {
        System.out.println("Running public method openBox by child class");
    }

    public void useBrush() {
        System.out.println("Running in public method useBrush");
    }
}
