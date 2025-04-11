package com.sam.task;

public class RunnerFan81 {
    public static void main(String[] args) {
        Fan81 fan = new Fan81();
        fan.switchOn();

        Fan81 f = new Spin();
        f.switchOn();

        Spin spin = new Spin();
        spin.setSpeed();
        spin.oscillate();
    }
}
