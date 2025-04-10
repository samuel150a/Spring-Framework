package com.access.specifier.internal;

public class PerfumeShelf {

    public PerfumeShelf() {
        System.out.println("PerfumeShelf constructor is running");
    }

    public void accessPerfume() {
        Perfume perfume = new Perfume();
        perfume.spray();
        perfume.smell();
    }
}
