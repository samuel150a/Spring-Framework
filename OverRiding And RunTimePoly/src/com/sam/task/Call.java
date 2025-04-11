package com.sam.task;

public class Call extends Phone41 {
    public Call() {
        System.out.println("Running in the Call constructor");
    }

    @Override
    public void ring() {
        System.out.println("Running in the public method ring after implementation");
    }

    public void connect() {
        System.out.println("Running in the public method connect");
    }

    public void disconnect() {
        System.out.println("Running in the public method disconnect");
    }
}
