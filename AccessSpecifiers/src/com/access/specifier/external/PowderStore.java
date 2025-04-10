package com.access.specifier.external;

import com.access.specifier.internal.Powder1;

public class PowderStore {

    public PowderStore() {
        System.out.println("PowderStore constructor is running");
    }

    public void displayPowder() {
        Powder1 powder1 = new Powder1();
        powder1.apply();
    }
}
