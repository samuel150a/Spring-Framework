package com.samuel.work;

public class RunnerShampoo77 {
    public static void main(String[] args) {
        Shampoo77 shampoo = new Shampoo77();
        shampoo.use(); // PARENT CLASS METHOD

        Shampoo77 herbalShampoo = new HerbalShampoo77();
        herbalShampoo.use(); // RUNTIME POLYMORPHISM

        HerbalShampoo77 hs = new HerbalShampoo77();
        hs.use(); // CHILD CLASS METHOD
        hs.nourish();

        ShampooStore store = new ShampooStore();
        store.show(shampoo);
        store.show(hs);
    }
}
