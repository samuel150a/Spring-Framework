package com.samuel.work;

public class RunnerMouthwash81 {
    public static void main(String[] args) {
        Mouthwash81 mouthwash = new Mouthwash81();
        mouthwash.use(); // PARENT CLASS METHOD

        Mouthwash81 mintMouthwash = new MintMouthwash81();
        mintMouthwash.use(); // RUNTIME POLYMORPHISM

        MintMouthwash81 mmw = new MintMouthwash81();
        mmw.use(); // CHILD CLASS METHOD
        mmw.freshen();

        MouthwashStore store = new MouthwashStore();
        store.show(mouthwash);
        store.show(mmw);
    }
}
