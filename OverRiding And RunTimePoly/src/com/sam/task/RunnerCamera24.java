package com.sam.task;

public class RunnerCamera24 {
    public static void main(String[] args) {
        Camera24 camera = new Camera24();
        camera.capture();

        Camera24 c = new Photo();
        c.capture();

        Photo photo = new Photo();
        photo.edit();
        photo.save();
    }
}
