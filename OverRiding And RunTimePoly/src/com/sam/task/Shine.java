package com.sam.task;

public class Shine extends Sky68 {
    public Shine() {
        System.out.println("Running in the Shine constructor");
    }

    @Override
    public void display() {
        System.out.println("Running in the overridden method display from Shine");
    }

    public void sunrise() {
        System.out.println("Running in the public method sunrise");
    }

    public void sunset() {
        System.out.println("Running in the public method sunset");
    }
}
