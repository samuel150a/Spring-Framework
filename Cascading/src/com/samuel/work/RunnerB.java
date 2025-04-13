package com.samuel.work;

public class RunnerB {
    public static void main(String[] args) {
        Bag2 bag = new Bag2();
        bag.useBag(); // NORMALLY ACCESSING PARENT CLASS METHOD

        Bag2 schoolBag = new SchoolBag2();
        schoolBag.useBag(); // RUNTIME POLYMORPHISM

        SchoolBag2 schoolBag2 = new SchoolBag2();
        schoolBag2.useBag(); // NORMALLY ACCESSING CHILD CLASS METHOD
        schoolBag2.carryBooks();

        BagStore store = new BagStore();
        store.show(bag);
        store.show(schoolBag2);
    }
}
