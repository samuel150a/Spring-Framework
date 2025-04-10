package com.sam.task;

public class Clothes extends Caboard14 {
    public Clothes() {
        System.out.println("Running in the Clothes constructor");
    }

    @Override
    public void store() {
        System.out.println("Running in the public method store after implementation");
    }

    public void wear() {
        System.out.println("Running in the public method wear");
    }

    public void wash() {
        System.out.println("Running in the public method wash");
    }
}
