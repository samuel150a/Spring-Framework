package com.samworkz.external;

import com.samworkz.internal.LPGRegulator;

public class Cylinder implements LPGRegulator {
    @Override
    public void gas() {
        System.out.println("Running the gas method in the Cylinder class");
    }
}
