package com.access.specifier.internal;

public class Temple {

    public Temple() {
        System.out.println("Temple constructor is running");
    }

    public void pray() {
        System.out.println("public method pray is running");
    }

    void ringBell() {
        System.out.println("default method ringBell is running");
    }

    private void meditate() {
        System.out.println("private method meditate is running");
    }
}
