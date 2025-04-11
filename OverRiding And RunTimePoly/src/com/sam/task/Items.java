package com.sam.task;

public class Items extends Bag91 {
    public Items() {
        System.out.println("Running in the Items constructor");
    }

    @Override
    public void carry() {
        System.out.println("Running in the overridden method carry from Items");
    }

    public void addItem() {
        System.out.println("Running in the public method addItem");
    }

    public void removeItem() {
        System.out.println("Running in the public method removeItem");
    }
}
