package com.samuel.work;

public class AdvancedVR55 extends VirtualReality55 {
    public AdvancedVR55() {
        System.out.println("Running in the AdvancedVR55 constructor");
    }

    @Override
    public void explore() {
        System.out.println("Running public method explore by child class");
    }

    public void experienceHolo() {
        System.out.println("Running in public method experienceHolo");
    }
}
