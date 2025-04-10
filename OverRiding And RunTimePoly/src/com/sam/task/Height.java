package com.sam.task;

public class Height extends Complain20 {
    public Height() {
        System.out.println("Running in the Height constructor");
    }

    @Override
    public void reportIssue() {
        System.out.println("Running in the public method reportIssue after implementation");
    }

    public void measure() {
        System.out.println("Running in the public method measure");
    }

    public void record() {
        System.out.println("Running in the public method record");
    }
}
