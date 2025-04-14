package com.samuel.work;

public class ElectricMotor66 extends Motor66 {
    public ElectricMotor66() {
        System.out.println("Running in the ElectricMotor66 constructor");
    }

    @Override
    public void rotate() {
        System.out.println("Running public method rotate by child class");
    }

    public void chargeBattery() {
        System.out.println("Running in public method chargeBattery");
    }
}
