package com.samuel.work;

public class AloeShowerGel79 extends ShowerGel79 {
    public AloeShowerGel79() {
        System.out.println("Running in the AloeShowerGel79 constructor");
    }

    @Override
    public void use() {
        System.out.println("Running public method use by child class");
    }

    public void hydrate() {
        System.out.println("Running in public method hydrate");
    }
}
