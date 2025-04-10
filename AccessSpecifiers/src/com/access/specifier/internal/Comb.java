package com.access.specifier.internal;

public class Comb {

    public Comb() {
        System.out.println("Comb constructor is running");
    }

    public void strength() {
        System.out.println("public method strength is running");
    }

    void angle() {
        System.out.println("default method angle is running");
    }

    private void clean() {
        System.out.println("private method clean is running");
    }
}
