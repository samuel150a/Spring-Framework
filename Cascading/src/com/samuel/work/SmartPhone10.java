package com.samuel.work;

public class SmartPhone10 extends Phone10 {
    public SmartPhone10() {
        System.out.println("Running in the SmartPhone10 constructor");
    }

    @Override
    public void call() {
        System.out.println("Running public method call by child class");
    }

    public void browseInternet() {
        System.out.println("Running in public method browseInternet");
    }
}
