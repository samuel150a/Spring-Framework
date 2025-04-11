package com.sam.task;

public class Textbook extends College88 {
    public Textbook() {
        System.out.println("Running in the Textbook constructor");
    }

    @Override
    public void provideEducation() {
        System.out.println("Running in the overridden method provideEducation from Textbook");
    }

    public void readChapters() {
        System.out.println("Running in the public method readChapters");
    }

    public void highlightNotes() {
        System.out.println("Running in the public method highlightNotes");
    }
}
