package com.sam.task;

public class Time extends Clock90 {
    public Time() {
        System.out.println("Running in the Time constructor");
    }

    @Override
    public void showTime() {
        System.out.println("Running in the overridden method showTime from Time");
    }

    public void setAlarm() {
        System.out.println("Running in the public method setAlarm");
    }

    public void resetClock() {
        System.out.println("Running in the public method resetClock");
    }
}
