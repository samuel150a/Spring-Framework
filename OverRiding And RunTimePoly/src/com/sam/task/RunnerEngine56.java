package com.sam.task;

public class RunnerEngine56 {
    public static void main(String[] args) {
        Engine56 engine = new Engine56();
        engine.start();

        Engine56 e = new Drive();
        e.start();

        Drive drive = new Drive();
        drive.accelerate();
        drive.brake();
    }
}
