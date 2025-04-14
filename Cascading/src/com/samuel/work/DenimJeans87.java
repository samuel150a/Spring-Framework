package com.samuel.work;

public class DenimJeans87 extends Jeans87 {
    public DenimJeans87() {
        System.out.println("Running in the DenimJeans87 constructor");
    }

    @Override
    public void wear() {
        System.out.println("Running public method wear by child class");
    }

    public void style() {
        System.out.println("Running in public method style");
    }
}
