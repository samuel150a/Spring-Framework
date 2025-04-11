package com.sam.task;

public class Notification extends App96 {
    public Notification() {
        System.out.println("Running in the Notification constructor");
    }

    @Override
    public void launch() {
        System.out.println("Running in the overridden method launch from Notification");
    }

    public void sendAlert() {
        System.out.println("Running in the public method sendAlert");
    }

    public void dismissAlert() {
        System.out.println("Running in the public method dismissAlert");
    }
}
