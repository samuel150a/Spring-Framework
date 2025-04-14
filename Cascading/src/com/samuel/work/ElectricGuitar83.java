package com.samuel.work;

public class ElectricGuitar83 extends Guitar83 {
    public ElectricGuitar83() {
        System.out.println("Running in the ElectricGuitar83 constructor");
    }

    @Override
    public void play() {
        System.out.println("Running public method play by child class");
    }

    public void amplify() {
        System.out.println("Running in public method amplify");
    }
}
