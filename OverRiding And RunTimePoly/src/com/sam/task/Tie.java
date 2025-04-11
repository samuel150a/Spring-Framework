package com.sam.task;

public class Tie extends Shoe79 {
    public Tie() {
        System.out.println("Running in the Tie constructor");
    }

    @Override
    public void wear() {
        System.out.println("Running in the overridden method wear from Tie");
    }

    public void tieLaces() {
        System.out.println("Running in the public method tieLaces");
    }

    public void untieLaces() {
        System.out.println("Running in the public method untieLaces");
    }
}
