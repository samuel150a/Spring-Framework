package com.sam.task;

public class Read extends Book46 {
    public Read() {
        System.out.println("Running in the Read constructor");
    }

    @Override
    public void open() {
        System.out.println("Running in the public method open after implementation");
    }

    public void study() {
        System.out.println("Running in the public method study");
    }

    public void gainKnowledge() {
        System.out.println("Running in the public method gainKnowledge");
    }
}

