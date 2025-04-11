package com.sam.task;

public class RunnerBook46 {
    public static void main(String[] args) {
        Book46 book = new Book46();
        book.open();

        Book46 b = new Read();
        b.open();

        Read read = new Read();
        read.study();
        read.gainKnowledge();
    }
}
