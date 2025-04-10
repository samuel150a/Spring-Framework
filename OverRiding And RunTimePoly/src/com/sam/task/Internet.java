package com.sam.task;

public class Internet extends Computer19 {
    public Internet() {
        System.out.println("Running in the Internet constructor");
    }

    @Override
    public void process() {
        System.out.println("Running in the public method process after implementation");
    }

    public void browse() {
        System.out.println("Running in the public method browse");
    }

    public void connect() {
        System.out.println("Running in the public method connect");
    }
}
