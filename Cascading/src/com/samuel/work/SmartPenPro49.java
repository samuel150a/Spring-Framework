package com.samuel.work;

public class SmartPenPro49 extends SmartPen49 {
    public SmartPenPro49() {
        System.out.println("Running in the SmartPenPro49 constructor");
    }

    @Override
    public void write() {
        System.out.println("Running public method write by child class");
    }

    public void syncNotes() {
        System.out.println("Running in public method syncNotes");
    }
}
