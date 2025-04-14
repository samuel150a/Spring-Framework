package com.samuel.work;

public class RunnerSensor24 {
    public static void main(String[] args) {
        Sensor24 sensor = new Sensor24();
        sensor.detect(); // NORMALLY ACCESSING PARENT CLASS METHOD

        Sensor24 motionSensor = new MotionSensor24();
        motionSensor.detect(); // RUNTIME POLYMORPHISM

        MotionSensor24 ms24 = new MotionSensor24();
        ms24.detect(); // NORMALLY ACCESSING CHILD CLASS METHOD
        ms24.triggerAlarm();

        SensorLab lab = new SensorLab();
        lab.show(sensor);
        lab.show(ms24);
    }
}
