package com.sam.task;

public class RunnerBrain39 {
    public static void main(String[] args) {
        Brain39 brain = new Brain39();
        brain.process();

        Brain39 b = new Thinking();
        b.process();

        Thinking thinking = new Thinking();
        thinking.analyze();
        thinking.imagine();
    }
}
