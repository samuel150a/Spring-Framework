package com.samuel.work;

public class ElectricDrum84 extends Drum84 {
    public ElectricDrum84() {
        System.out.println("Running in the ElectricDrum84 constructor");
    }

    @Override
    public void play() {
        System.out.println("Running public method play by child class");
    }

    public void amplify() {
        System.out.println("Running in public method amplify");
    }
}
