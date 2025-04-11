package com.sam.task;

public class Drink extends Water45 {
    public Drink() {
        System.out.println("Running in the Drink constructor");
    }

    @Override
    public void flow() {
        System.out.println("Running in the public method flow after implementation");
    }

    public void quenchThirst() {
        System.out.println("Running in the public method quenchThirst");
    }

    public void refresh() {
        System.out.println("Running in the public method refresh");
    }
}
