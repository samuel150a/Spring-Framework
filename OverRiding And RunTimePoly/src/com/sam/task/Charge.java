package com.sam.task;

public class Charge extends Battery50 {
    public Charge() {
        System.out.println("Running in the Charge constructor");
    }

    @Override
    public void storePower() {
        System.out.println("Running in the public method storePower after implementation");
    }

    public void fill() {
        System.out.println("Running in the public method fill");
    }

    public void supply() {
        System.out.println("Running in the public method supply");
    }
}
