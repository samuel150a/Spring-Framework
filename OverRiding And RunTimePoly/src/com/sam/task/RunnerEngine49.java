package com.sam.task;

public class RunnerEngine49 {
    public static void main(String[] args) {
        Engine49 engine = new Engine49();
        engine.start();

        Engine49 e = new Speed();
        e.start();

        Speed speed = new Speed();
        speed.accelerate();
        speed.boost();
    }
}
