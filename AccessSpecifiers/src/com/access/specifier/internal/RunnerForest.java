package com.access.specifier.internal;

import com.access.specifier.internal.ForestZone;
import com.access.specifier.external.ForestTour;

public class RunnerForest {
    public static void main(String[] args) {
        ForestZone forestZone = new ForestZone();
        forestZone.accessForest();

        ForestTour forestTour = new ForestTour();
        forestTour.displayForest();
    }
}
