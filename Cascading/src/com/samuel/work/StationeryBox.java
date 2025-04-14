package com.samuel.work;

public class StationeryBox {
    public StationeryBox() {
        System.out.println("Running the StationeryBox constructor");
    }

    public void show(Pencil31 pencil) {
        if (pencil != null) {
            pencil.write();
            if (pencil instanceof ColorPencil31) {
                ColorPencil31 ref = (ColorPencil31) pencil;
                ref.draw();
            } else {
                System.out.println("Pencil31 is not an instance of ColorPencil31, cannot call cascaded method");
            }
        } else {
            System.out.println("Pencil31 is null");
        }
    }
}
