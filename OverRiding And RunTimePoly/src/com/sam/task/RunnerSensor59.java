package com.sam.task;

public class RunnerSensor59 {
    public static void main(String[] args) {
        Sensor59 sensor = new Sensor59();
        sensor.sense();

        Sensor59 s = new Detect();
        s.sense();

        Detect detect = new Detect();
        detect.detectMotion();
        detect.detectHeat();
    }
}
