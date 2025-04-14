package com.samuel.work;

public class SensorLab {
    public SensorLab() {
        System.out.println("Running the SensorLab constructor");
    }

    public void show(Sensor24 sensor) {
        if (sensor != null) {
            sensor.detect();
            if (sensor instanceof MotionSensor24) {
                MotionSensor24 ref = (MotionSensor24) sensor;
                ref.triggerAlarm();
            } else {
                System.out.println("Sensor24 is not an instance of MotionSensor24, cannot call cascaded method");
            }
        } else {
            System.out.println("Sensor24 is null");
        }
    }
}
