package com.samuel.work;

public class TapeBox {
    public TapeBox() {
        System.out.println("Running the TapeBox constructor");
    }

    public void show(CelloTape28 tape) {
        if (tape != null) {
            tape.stick();
            if (tape instanceof ColorTape28) {
                ColorTape28 ref = (ColorTape28) tape;
                ref.decorate();
            } else {
                System.out.println("CelloTape28 is not an instance of ColorTape28, cannot call cascaded method");
            }
        } else {
            System.out.println("CelloTape28 is null");
        }
    }
}
