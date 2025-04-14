package com.samuel.work;

public class WoolBlanket75 extends Blanket75 {
    public WoolBlanket75() {
        System.out.println("Running in the WoolBlanket75 constructor");
    }

    @Override
    public void use() {
        System.out.println("Running public method use by child class");
    }

    public void warmUp() {
        System.out.println("Running in public method warmUp");
    }
}
