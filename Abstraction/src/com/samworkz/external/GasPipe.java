package com.samworkz.external;

import com.samworkz.internal.LPGRegulator;

public class GasPipe implements LPGRegulator {

    @Override
    public void gas() {
        {
            System.out.println("Running the gas method in the GasPipe class");
        }
    }
}
