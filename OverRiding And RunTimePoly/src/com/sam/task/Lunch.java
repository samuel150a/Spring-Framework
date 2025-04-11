package com.sam.task;

public class Lunch extends Hotel92 {
    public Lunch() {
        System.out.println("Running in the Lunch constructor");
    }

    @Override
    public void serve() {
        System.out.println("Running in the overridden method serve from Lunch");
    }

    public void prepareFood() {
        System.out.println("Running in the public method prepareFood");
    }

    public void cleanTable() {
        System.out.println("Running in the public method cleanTable");
    }
}
