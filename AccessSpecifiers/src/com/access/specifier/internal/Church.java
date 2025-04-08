package com.access.specifier.internal;


public class Church {
    public Church() {
        System.out.println("no-arg Church constructor running");
    }

    public void prayer_hall() {
        System.out.println("Running public prayer_hall method");
    }

    void bell_tower() {
        System.out.println("Running package default bell_tower method");
    }

     private void confession_room() {
        System.out.println("Running private confession_room method");
    }
}
