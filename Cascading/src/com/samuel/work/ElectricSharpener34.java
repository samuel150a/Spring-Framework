package com.samuel.work;

public class ElectricSharpener34 extends Sharpener34 {
    public ElectricSharpener34() {
        System.out.println("Running in the ElectricSharpener34 constructor");
    }

    @Override
    public void sharpen() {
        System.out.println("Running public method sharpen by child class");
    }

    public void autoSharpen() {
        System.out.println("Running in public method autoSharpen");
    }
}
