package com.samuel.work;

public class ElectricScissor29 extends Scissor29 {
    public ElectricScissor29() {
        System.out.println("Running in the ElectricScissor29 constructor");
    }

    @Override
    public void cut() {
        System.out.println("Running public method cut by child class");
    }

    public void autoCut() {
        System.out.println("Running in public method autoCut");
    }
}
