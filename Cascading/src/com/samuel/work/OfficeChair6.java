package com.samuel.work;

public class OfficeChair6 extends Chair6 {
    public OfficeChair6() {
        System.out.println("Running in the OfficeChair6 constructor");
    }

    @Override
    public void sitOn() {
        System.out.println("Running public method sitOn by child class");
    }

    public void adjustHeight() {
        System.out.println("Running in public method adjustHeight");
    }
}
