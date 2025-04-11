package com.sam.task;

public class RunnerWheel61 {
    public static void main(String[] args) {
        Wheel61 wheel = new Wheel61();
        wheel.rotate();

        Wheel61 w = new Roll();
        w.rotate();

        Roll roll = new Roll();
        roll.speedUp();
        roll.stopRolling();
    }
}
