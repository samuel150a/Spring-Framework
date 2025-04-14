package com.samuel.work;

public class PaletteStand {
    public PaletteStand() {
        System.out.println("Running the PaletteStand constructor");
    }

    public void show(Palette41 palette) {
        if (palette != null) {
            palette.openPalette();
            if (palette instanceof MixingPalette41) {
                MixingPalette41 ref = (MixingPalette41) palette;
                ref.mixColors();
            } else {
                System.out.println("Palette41 is not an instance of MixingPalette41, cannot call cascaded method");
            }
        } else {
            System.out.println("Palette41 is null");
        }
    }
}
