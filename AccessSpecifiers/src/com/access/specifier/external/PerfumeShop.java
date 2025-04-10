package com.access.specifier.external;

import com.access.specifier.internal.Perfume;

public class PerfumeShop {

    public PerfumeShop() {
        System.out.println("PerfumeShop constructor is running");
    }

    public void displayPerfume() {
        Perfume perfume = new Perfume();
        perfume.spray();
    }
}
