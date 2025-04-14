package com.samuel.work;

public class FrozenIce86 extends Ice86 {
    public FrozenIce86() {
        System.out.println("Running in the FrozenIce86 constructor");
    }

    @Override
    public void freeze() {
        System.out.println("Running public method freeze by child class");
    }

    public void flavor() {
        System.out.println("Running in public method flavor");
    }
}
