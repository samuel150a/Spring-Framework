package com.sam.task;

public class Groceries extends Mall94 {
    public Groceries() {
        System.out.println("Running in the Groceries constructor");
    }

    @Override
    public void enter() {
        System.out.println("Running in the overridden method enter from Groceries");
    }

    public void pickItems() {
        System.out.println("Running in the public method pickItems");
    }

    public void checkout() {
        System.out.println("Running in the public method checkout");
    }
}
