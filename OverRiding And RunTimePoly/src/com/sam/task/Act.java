package com.sam.task;

public class Act extends Robot57 {
    public Act() {
        System.out.println("Running in the Act constructor");
    }

    @Override
    public void performTask() {
        System.out.println("Running in the overridden method performTask from Act");
    }

    public void dance() {
        System.out.println("Running in the public method dance");
    }

    public void speak() {
        System.out.println("Running in the public method speak");
    }
}
