package com.access.specifier.external;

import com.access.specifier.internal.Temple;

public class TempleVisit {

    public TempleVisit() {
        System.out.println("TempleVisit constructor is running");
    }

    public void displayTemple() {
        Temple temple = new Temple();
        temple.pray();
    }
}
