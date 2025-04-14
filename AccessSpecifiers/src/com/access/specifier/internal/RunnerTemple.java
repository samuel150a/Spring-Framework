package com.access.specifier.internal;
import com.access.specifier.internal.TempleArea;
import com.access.specifier.external.TempleVisit;

public class RunnerTemple {
    public static void main(String[] args) {
        TempleArea templeArea = new TempleArea();
        templeArea.accessTemple();

        TempleVisit templeVisit = new TempleVisit();
        templeVisit.displayTemple();
    }
}

