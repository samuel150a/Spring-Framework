package com.sam.task;

public class Body extends Virus12 {
    public Body() {
        System.out.println("Running in the Body constructor");
    }

    @Override
    public void spread() {
        System.out.println("Running in the public method spread after implementation");
    }

    public void immuneSystem() {
        System.out.println("Running in the public method immuneSystem");
    }

    public void protect() {
        System.out.println("Running in the public method protect");
    }
}
