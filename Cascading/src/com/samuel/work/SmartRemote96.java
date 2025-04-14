package com.samuel.work;

public class SmartRemote96 extends Remote96 {
    public SmartRemote96() {
        System.out.println("Running in the SmartRemote96 constructor");
    }

    @Override
    public void control() {
        System.out.println("Running public method control by child class");
    }

    public void connectWiFi() {
        System.out.println("Running in public method connectWiFi");
    }
}
