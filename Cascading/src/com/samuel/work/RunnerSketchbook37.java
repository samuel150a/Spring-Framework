package com.samuel.work;

public class RunnerSketchbook37 {
    public static void main(String[] args) {
        Sketchbook37 sketchbook = new Sketchbook37();
        sketchbook.sketch(); // NORMALLY ACCESSING PARENT CLASS METHOD

        Sketchbook37 artSketchbook = new ArtSketchbook37();
        artSketchbook.sketch(); // RUNTIME POLYMORPHISM

        ArtSketchbook37 as37 = new ArtSketchbook37();
        as37.sketch(); // NORMALLY ACCESSING CHILD CLASS METHOD
        as37.drawArt();

        SketchbookShelf shelf = new SketchbookShelf();
        shelf.show(sketchbook);
        shelf.show(as37);
    }
}
