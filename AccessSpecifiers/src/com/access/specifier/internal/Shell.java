package com.access.specifier.internal;

public class Shell {

    public Shell() {
        System.out.println("Shell constructor is running");
    }

    public void crack() {
        System.out.println("public method crack is running");
    }

    void shine() {
        System.out.println("default method shine is running");
    }

    private void dissolve() {
        System.out.println("private method dissolve is running");
    }
}
