package com.access.specifier.internal;


public class ServiceCounter {
    public ServiceCounter() {
        System.out.println("Running ServiceCounter constructor");
    }

    public void ChurchAccess() {
        System.out.println("Accessing public and default access specifiers from internal package");
        Church church = new Church();
        church.bell_tower();
        church.prayer_hall();
    }
}
