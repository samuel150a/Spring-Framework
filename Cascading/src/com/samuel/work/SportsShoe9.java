package com.samuel.work;

public class SportsShoe9 extends Shoe9 {
    public SportsShoe9() {
        System.out.println("Running in the SportsShoe9 constructor");
    }

    @Override
    public void wear() {
        System.out.println("Running public method wear by child class");
    }

    public void runFast() {
        System.out.println("Running in public method runFast");
    }
}
