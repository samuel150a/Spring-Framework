package com.access.specifier.internal;

public class Forest {

    public Forest() {
        System.out.println("Forest constructor is running");
    }

    public void grow() {
        System.out.println("public method grow is running");
    }

    void shelter() {
        System.out.println("default method shelter is running");
    }

    private void burn() {
        System.out.println("private method burn is running");
    }
}
