package com.access.specifier.internal;

public class Powder1 {

    public Powder1() {
        System.out.println("Powder constructor is running");
    }

    public void apply() {
        System.out.println("public method apply is running");
    }

    void sprinkle() {
        System.out.println("default method sprinkle is running");
    }

    private void seal() {
        System.out.println("private method seal is running");
    }
}
