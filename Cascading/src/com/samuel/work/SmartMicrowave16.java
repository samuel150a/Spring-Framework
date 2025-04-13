package com.samuel.work;

public class SmartMicrowave16 extends Microwave16 {
    public SmartMicrowave16() {
        System.out.println("Running in the SmartMicrowave16 constructor");
    }

    @Override
    public void cook() {
        System.out.println("Running public method cook by child class");
    }

    public void defrost() {
        System.out.println("Running in public method defrost");
    }
}
