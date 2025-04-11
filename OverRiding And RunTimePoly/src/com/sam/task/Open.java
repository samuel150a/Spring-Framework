package com.sam.task;

public class Open extends Window74 {
    public Open() {
        System.out.println("Running in the Open constructor");
    }

    @Override
    public void unlock() {
        System.out.println("Running in the overridden method unlock from Open");
    }

    public void slideOpen() {
        System.out.println("Running in the public method slideOpen");
    }

    public void closeWindow() {
        System.out.println("Running in the public method closeWindow");
    }
}
