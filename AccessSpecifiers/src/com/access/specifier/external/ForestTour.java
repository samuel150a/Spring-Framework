package com.access.specifier.external;

import com.access.specifier.internal.Forest;

public class ForestTour {

    public ForestTour() {
        System.out.println("ForestTour constructor is running");
    }

    public void displayForest() {
        Forest forest = new Forest();
        forest.grow();
    }
}
