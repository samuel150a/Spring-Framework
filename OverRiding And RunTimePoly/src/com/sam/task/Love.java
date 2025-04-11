package com.sam.task;

public class Love extends Heart40 {
    public Love() {
        System.out.println("Running in the Love constructor");
    }

    @Override
    public void beat() {
        System.out.println("Running in the public method beat after implementation");
    }

    public void care() {
        System.out.println("Running in the public method care");
    }

    public void feel() {
        System.out.println("Running in the public method feel");
    }
}
