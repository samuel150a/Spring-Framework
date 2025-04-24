package com.samworkz.external;

import com.samworkz.internal.Nail;

public class Clock implements Nail {

    @Override
    public void beat() {
        System.out.println("Running the beat method in the Clock class");

    }
}
