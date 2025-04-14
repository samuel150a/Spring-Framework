package com.samuel.work;

public class DslrCamera64 extends Camera64 {
    public DslrCamera64() {
        System.out.println("Running in the DslrCamera64 constructor");
    }

    @Override
    public void click() {
        System.out.println("Running public method click by child class");
    }

    public void zoomLens() {
        System.out.println("Running in public method zoomLens");
    }
}
