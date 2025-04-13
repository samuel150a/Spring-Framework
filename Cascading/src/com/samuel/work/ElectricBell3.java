package com.samuel.work;

public class ElectricBell3 extends Bell3 {
    public ElectricBell3() {
        System.out.println("Running in the ElectricBell3 constructor");
    }

    @Override
    public void ringBell() {
        System.out.println("Running public method ringBell by child class");
    }

    public void chargeBattery() {
        System.out.println("Running in public method chargeBattery");
    }
}

