package com.sam.task;

public class Trees extends Jungle11 {
    public Trees() {
        System.out.println("Running in the Trees constructor");
    }

    @Override
    public void grow() {
        System.out.println("Running in the public method grow after implementation");
    }

    public void giveOxygen() {
        System.out.println("Running in the public method giveOxygen");
    }

    public void provideShade() {
        System.out.println("Running in the public method provideShade");
    }
}
