package com.access.specifier.internal;
import com.access.specifier.internal.PowderBox;
import com.access.specifier.external.PowderStore;

public class RunnerPowder {
    public static void main(String[] args) {
        PowderBox powderBox = new PowderBox();
        powderBox.accessPowder();

        PowderStore powderStore = new PowderStore();
        powderStore.displayPowder();
    }
}
