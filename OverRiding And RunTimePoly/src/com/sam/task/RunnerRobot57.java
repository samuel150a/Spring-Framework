package com.sam.task;

public class RunnerRobot57 {
    public static void main(String[] args) {
        Robot57 robot = new Robot57();
        robot.performTask();

        Robot57 r = new Act();
        r.performTask();

        Act act = new Act();
        act.dance();
        act.speak();
    }
}
