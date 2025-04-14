package com.samuel.work;

public class YogaMat67 extends Mat67 {
    public YogaMat67() {
        System.out.println("Running in the YogaMat67 constructor");
    }

    @Override
    public void rollOut() {
        System.out.println("Running public method rollOut by child class");
    }

    public void stretchOnIt() {
        System.out.println("Running in public method stretchOnIt");
    }
}
