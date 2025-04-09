package com.xworkz.internal;

public class Revolver extends Weapon {

    public Revolver ()
    {
        System.out.println("no args  revolver constructor");
    }
    public void Access() {
        Weapon weapon = new Revolver();
    }
}
