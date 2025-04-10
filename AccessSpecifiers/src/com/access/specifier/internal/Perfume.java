package com.access.specifier.internal;

public class Perfume {

    public Perfume() {
        System.out.println("Perfume constructor is running");
    }

    public void spray() {
        System.out.println("public method spray is running");
    }

    void smell() {
        System.out.println("default method smell is running");
    }

    private void evaporate() {
        System.out.println("private method evaporate is running");
    }
}
