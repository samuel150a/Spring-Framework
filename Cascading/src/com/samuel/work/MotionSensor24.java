package com.samuel.work;

public class MotionSensor24 extends Sensor24 {
    public MotionSensor24() {
        System.out.println("Running in the MotionSensor24 constructor");
    }

    @Override
    public void detect() {
        System.out.println("Running public method detect by child class");
    }

    public void triggerAlarm() {
        System.out.println("Running in public method triggerAlarm");
    }
}
