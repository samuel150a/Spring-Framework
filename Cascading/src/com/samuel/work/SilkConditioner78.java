package com.samuel.work;

public class SilkConditioner78 extends Conditioner78 {
    public SilkConditioner78() {
        System.out.println("Running in the SilkConditioner78 constructor");
    }

    @Override
    public void apply() {
        System.out.println("Running public method apply by child class");
    }

    public void smoothen() {
        System.out.println("Running in public method smoothen");
    }
}
