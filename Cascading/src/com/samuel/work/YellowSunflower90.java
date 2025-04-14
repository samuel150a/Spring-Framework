package com.samuel.work;

public class YellowSunflower90 extends Sunflower90 {
    public YellowSunflower90() {
        System.out.println("Running in the YellowSunflower90 constructor");
    }

    @Override
    public void bloom() {
        System.out.println("Running public method bloom by child class");
    }

    public void grow() {
        System.out.println("Running in public method grow");
    }
}
