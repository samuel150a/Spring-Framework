package com.samuel.work;

public class RunnerToothpaste82 {
    public static void main(String[] args) {
        Toothpaste82 toothpaste = new Toothpaste82();
        toothpaste.use(); // PARENT CLASS METHOD

        Toothpaste82 whiteningToothpaste = new WhiteningToothpaste82();
        whiteningToothpaste.use(); // RUNTIME POLYMORPHISM

        WhiteningToothpaste82 wt = new WhiteningToothpaste82();
        wt.use(); // CHILD CLASS METHOD
        wt.whiten();

        ToothpasteStore store = new ToothpasteStore();
        store.show(toothpaste);
        store.show(wt);
    }
}
