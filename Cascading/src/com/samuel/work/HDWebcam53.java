package com.samuel.work;

public class HDWebcam53 extends Webcam53 {
    public HDWebcam53() {
        System.out.println("Running in the HDWebcam53 constructor");
    }

    @Override
    public void capture() {
        System.out.println("Running public method capture by child class");
    }

    public void streamLive() {
        System.out.println("Running in public method streamLive");
    }
}
