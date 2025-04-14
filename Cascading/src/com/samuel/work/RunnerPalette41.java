package com.samuel.work;

public class RunnerPalette41 {
    public static void main(String[] args) {
        Palette41 palette = new Palette41();
        palette.openPalette(); // NORMALLY ACCESSING PARENT CLASS METHOD

        Palette41 mixingPalette = new MixingPalette41();
        mixingPalette.openPalette(); // RUNTIME POLYMORPHISM

        MixingPalette41 mp41 = new MixingPalette41();
        mp41.openPalette(); // NORMALLY ACCESSING CHILD CLASS METHOD
        mp41.mixColors();

        PaletteStand stand = new PaletteStand();
        stand.show(palette);
        stand.show(mp41);
    }
}
