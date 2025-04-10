package com.sam.task;

public class Photo extends Camera24 {
    public Photo() {
        System.out.println("Running in the Photo constructor");
    }

    @Override
    public void capture() {
        System.out.println("Running in the public method capture after implementation");
    }

    public void edit() {
        System.out.println("Running in the public method edit");
    }

    public void save() {
        System.out.println("Running in the public method save");
    }
}
