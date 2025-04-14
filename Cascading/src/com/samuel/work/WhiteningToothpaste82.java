package com.samuel.work;

public class WhiteningToothpaste82 extends Toothpaste82 {
    public WhiteningToothpaste82() {
        System.out.println("Running in the WhiteningToothpaste82 constructor");
    }

    @Override
    public void use() {
        System.out.println("Running public method use by child class");
    }

    public void whiten() {
        System.out.println("Running in public method whiten");
    }
}
