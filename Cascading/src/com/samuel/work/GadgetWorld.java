package com.samuel.work;

public class GadgetWorld {
    public GadgetWorld() {
        System.out.println("Running the GadgetWorld constructor");
    }

    public void show(iPad48 pad) {
        if (pad != null) {
            pad.browse();
            if (pad instanceof iPadPro48) {
                iPadPro48 ref = (iPadPro48) pad;
                ref.drawWithPencil();
            } else {
                System.out.println("iPad48 is not an instance of iPadPro48, cannot call cascaded method");
            }
        } else {
            System.out.println("iPad48 is null");
        }
    }
}
