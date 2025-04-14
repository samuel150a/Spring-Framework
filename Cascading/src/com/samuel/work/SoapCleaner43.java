package com.samuel.work;

public class SoapCleaner43 extends BrushCleaner43 {
    public SoapCleaner43() {
        System.out.println("Running in the SoapCleaner43 constructor");
    }

    @Override
    public void cleanBrush() {
        System.out.println("Running public method cleanBrush by child class");
    }

    public void rinseBrush() {
        System.out.println("Running in public method rinseBrush");
    }
}
