package com.samuel.work;

public class SketchbookShelf {
    public SketchbookShelf() {
        System.out.println("Running the SketchbookShelf constructor");
    }

    public void show(Sketchbook37 sketchbook) {
        if (sketchbook != null) {
            sketchbook.sketch();
            if (sketchbook instanceof ArtSketchbook37) {
                ArtSketchbook37 ref = (ArtSketchbook37) sketchbook;
                ref.drawArt();
            } else {
                System.out.println("Sketchbook37 is not an instance of ArtSketchbook37, cannot call cascaded method");
            }
        } else {
            System.out.println("Sketchbook37 is null");
        }
    }
}
