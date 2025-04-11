package com.sam.task;

public class ClothWash extends River30 {
    public ClothWash() {
        System.out.println("Running in the ClothWash constructor");
    }

    @Override
    public void flow() {
        System.out.println("Running in the public method flow after implementation");
    }

    public void rinse() {
        System.out.println("Running in the public method rinse");
    }

    public void dry() {
        System.out.println("Running in the public method dry");
    }
}
