package com.samuel.work;

public class RunnerCelloTape28 {
    public static void main(String[] args) {
        CelloTape28 tape = new CelloTape28();
        tape.stick(); // NORMALLY ACCESSING PARENT CLASS METHOD

        CelloTape28 colorTape = new ColorTape28();
        colorTape.stick(); // RUNTIME POLYMORPHISM

        ColorTape28 ct28 = new ColorTape28();
        ct28.stick(); // NORMALLY ACCESSING CHILD CLASS METHOD
        ct28.decorate();

        TapeBox box = new TapeBox();
        box.show(tape);
        box.show(ct28);
    }
}
