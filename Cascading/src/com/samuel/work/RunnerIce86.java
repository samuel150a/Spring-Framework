package com.samuel.work;

public class RunnerIce86 {
    public static void main(String[] args) {
        Ice86 ice = new Ice86();
        ice.freeze(); // PARENT CLASS METHOD

        Ice86 frozenIce = new FrozenIce86();
        frozenIce.freeze(); // RUNTIME POLYMORPHISM

        FrozenIce86 fi = new FrozenIce86();
        fi.freeze(); // CHILD CLASS METHOD
        fi.flavor();

        IceStore store = new IceStore();
        store.show(ice);
        store.show(fi);
    }
}
