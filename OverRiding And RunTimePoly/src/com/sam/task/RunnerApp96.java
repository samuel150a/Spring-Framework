package com.sam.task;

public class RunnerApp96 {
    public static void main(String[] args) {
        App96 app = new App96();
        app.launch();

        App96 a = new Notification();
        a.launch();

        Notification notification = new Notification();
        notification.sendAlert();
        notification.dismissAlert();
    }
}
