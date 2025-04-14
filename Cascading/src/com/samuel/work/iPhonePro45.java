package com.samuel.work;

public class iPhonePro45 extends iPhone45 {
    public iPhonePro45() {
        System.out.println("Running in the iPhonePro45 constructor");
    }

    @Override
    public void usePhone() {
        System.out.println("Running public method usePhone by child class");
    }

    public void recordVideo() {
        System.out.println("Running in public method recordVideo");
    }
}
