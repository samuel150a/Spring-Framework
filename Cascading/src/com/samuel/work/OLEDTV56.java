package com.samuel.work;

public class OLEDTV56 extends SmartTV56 {
    public OLEDTV56() {
        System.out.println("Running in the OLEDTV56 constructor");
    }

    @Override
    public void watch() {
        System.out.println("Running public method watch by child class");
    }

    public void displayOLED() {
        System.out.println("Running in public method displayOLED");
    }
}
