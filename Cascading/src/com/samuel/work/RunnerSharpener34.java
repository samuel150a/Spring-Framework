package com.samuel.work;

public class RunnerSharpener34 {
    public static void main(String[] args) {
        Sharpener34 sharpener = new Sharpener34();
        sharpener.sharpen(); // NORMALLY ACCESSING PARENT CLASS METHOD

        Sharpener34 electricSharpener = new ElectricSharpener34();
        electricSharpener.sharpen(); // RUNTIME POLYMORPHISM

        ElectricSharpener34 es34 = new ElectricSharpener34();
        es34.sharpen(); // NORMALLY ACCESSING CHILD CLASS METHOD
        es34.autoSharpen();

        SharpenerBox box = new SharpenerBox();
        box.show(sharpener);
        box.show(es34);
    }
}
