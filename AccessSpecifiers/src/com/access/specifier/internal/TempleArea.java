package com.access.specifier.internal;

public class TempleArea {

    public TempleArea() {
        System.out.println("TempleArea constructor is running");
    }

    public void accessTemple() {
        Temple temple = new Temple();
        temple.pray();
        temple.ringBell();
    }
}
