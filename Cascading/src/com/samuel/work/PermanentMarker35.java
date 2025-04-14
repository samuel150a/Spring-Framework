package com.samuel.work;

public class PermanentMarker35 extends Marker35 {
    public PermanentMarker35() {
        System.out.println("Running in the PermanentMarker35 constructor");
    }

    @Override
    public void write() {
        System.out.println("Running public method write by child class");
    }

    public void mark() {
        System.out.println("Running in public method mark");
    }
}
