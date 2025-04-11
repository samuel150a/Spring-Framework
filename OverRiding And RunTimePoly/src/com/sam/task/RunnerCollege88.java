package com.sam.task;

public class RunnerCollege88 {
    public static void main(String[] args) {
        College88 college = new College88();
        college.provideEducation();

        College88 c = new Textbook();
        c.provideEducation();

        Textbook textbook = new Textbook();
        textbook.readChapters();
        textbook.highlightNotes();
    }
}
