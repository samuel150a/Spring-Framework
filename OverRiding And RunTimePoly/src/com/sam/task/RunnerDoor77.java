package com.sam.task;

public class RunnerDoor77 {
    public static void main(String[] args) {
        Door77 door = new Door77();
        door.close();

        Door77 d = new Knock();
        d.close();

        Knock knock = new Knock();
        knock.knockDoor();
        knock.openDoor();
    }
}
