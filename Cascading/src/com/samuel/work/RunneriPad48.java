package com.samuel.work;

public class RunneriPad48 {
    public static void main(String[] args) {
        iPad48 pad = new iPad48();
        pad.browse(); // PARENT CLASS METHOD

        iPad48 proPad = new iPadPro48();
        proPad.browse(); // RUNTIME POLYMORPHISM

        iPadPro48 ipadPro = new iPadPro48();
        ipadPro.browse(); // CHILD CLASS METHOD
        ipadPro.drawWithPencil();

        GadgetWorld world = new GadgetWorld();
        world.show(pad);
        world.show(ipadPro);
    }
}
