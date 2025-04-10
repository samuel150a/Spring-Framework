package com.sam.task;

public class Income extends PG17 {
    public Income() {
        System.out.println("Running in the Income constructor");
    }

    @Override
    public void rent() {
        System.out.println("Running in the public method rent after implementation");
    }

    public void salary() {
        System.out.println("Running in the public method salary");
    }

    public void savings() {
        System.out.println("Running in the public method savings");
    }
}
