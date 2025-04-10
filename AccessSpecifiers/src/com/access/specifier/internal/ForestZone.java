package com.access.specifier.internal;

public class ForestZone {

    public ForestZone() {
        System.out.println("ForestZone constructor is running");
    }

    public void accessForest() {
        Forest forest = new Forest();
        forest.grow();
        forest.shelter();
    }
}
