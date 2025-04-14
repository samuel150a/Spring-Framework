package com.samuel.work;

public class DeviceBench {
    public DeviceBench() {
        System.out.println("Running the DeviceBench constructor");
    }

    public void show(Webcam53 webcam) {
        if (webcam != null) {
            webcam.capture();
            if (webcam instanceof HDWebcam53) {
                HDWebcam53 ref = (HDWebcam53) webcam;
                ref.streamLive();
            } else {
                System.out.println("Webcam53 is not an instance of HDWebcam53, cannot call cascaded method");
            }
        } else {
            System.out.println("Webcam53 is null");
        }
    }
}
