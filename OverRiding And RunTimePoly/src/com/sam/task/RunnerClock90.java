package com.sam.task;

public class RunnerClock90 {
    public static void main(String[] args) {
        Clock90 clock = new Clock90();
        clock.showTime();

        Clock90 c = new Time();
        c.showTime();

        Time time = new Time();
        time.setAlarm();
        time.resetClock();
    }
}
