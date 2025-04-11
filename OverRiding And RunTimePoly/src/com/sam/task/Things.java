package com.sam.task;

public class Things extends Bag26 {
    public Things() {
        System.out.println("Running in the Things constructor");
    }

    @Override
    public void carry() {
        System.out.println("Running in the public method carry after implementation");
    }

    public void organize() {
        System.out.println("Running in the public method organize");
    }

    public void unpack() {
        System.out.println("Running in the public method unpack");
    }
}

