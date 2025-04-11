package com.sam.task;

public class Money extends Purse87 {
    public Money() {
        System.out.println("Running in the Money constructor");
    }

    @Override
    public void open() {
        System.out.println("Running in the overridden method open from Money");
    }

    public void addCash() {
        System.out.println("Running in the public method addCash");
    }

    public void countCash() {
        System.out.println("Running in the public method countCash");
    }
}
