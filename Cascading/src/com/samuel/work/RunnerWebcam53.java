package com.samuel.work;

public class RunnerWebcam53 {
    public static void main(String[] args) {
        Webcam53 webcam = new Webcam53();
        webcam.capture(); // PARENT CLASS METHOD

        Webcam53 hd = new HDWebcam53();
        hd.capture(); // RUNTIME POLYMORPHISM

        HDWebcam53 hdWebcam = new HDWebcam53();
        hdWebcam.capture(); // CHILD CLASS METHOD
        hdWebcam.streamLive();

        DeviceBench bench = new DeviceBench();
        bench.show(webcam);
        bench.show(hdWebcam);
    }
}
