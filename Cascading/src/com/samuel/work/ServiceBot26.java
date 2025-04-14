package com.samuel.work;

public class ServiceBot26 extends Bot26 {
    public ServiceBot26() {
        System.out.println("Running in the ServiceBot26 constructor");
    }

    @Override
    public void operate() {
        System.out.println("Running public method operate by child class");
    }

    public void deliverPackage() {
        System.out.println("Running in public method deliverPackage");
    }
}
