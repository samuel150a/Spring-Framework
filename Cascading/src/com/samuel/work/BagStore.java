package com.samuel.work;

public class BagStore {
    public BagStore() {
        System.out.println("Running the BagStore constructor");
    }

    public void show(Bag2 bag) {
        if (bag != null) {
            bag.useBag();
            if (bag instanceof SchoolBag2) {
                SchoolBag2 ref = (SchoolBag2) bag;
                ref.carryBooks();
            } else {
                System.out.println("Bag2 is not an instance of SchoolBag2, cannot call cascaded method");
            }
        } else {
            System.out.println("Bag2 is null");
        }
    }
}
