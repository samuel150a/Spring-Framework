package com.samworkz.external;

import com.samworkz.internal.Cable;

public class Speaker implements Cable {
    @Override
    public void sound(){
        System.out.println("Running the sound method in the Speaker class");

    }
}
