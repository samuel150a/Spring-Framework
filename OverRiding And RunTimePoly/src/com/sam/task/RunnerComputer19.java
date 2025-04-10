package com.sam.task;

public class RunnerComputer19 {
    public static void main(String[] args) {
        Computer19 computer = new Computer19();
        computer.process();

        Computer19 c = new Internet();
        c.process();

        Internet internet = new Internet();
        internet.browse();
        internet.connect();
    }
}
