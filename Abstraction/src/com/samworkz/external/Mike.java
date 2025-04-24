package com.samworkz.external;

import com.samworkz.internal.Cable;

public class Mike implements Cable {
    @Override
    public void sound() {
        System.out.println("Running the sound method in the Mike class");

    }
}
