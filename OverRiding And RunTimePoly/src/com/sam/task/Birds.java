package com.sam.task;

public class Birds extends Branches83 {
    public Birds() {
        System.out.println("Running in the Birds constructor");
    }

    @Override
    public void sway() {
        System.out.println("Running in the overridden method sway from Birds");
    }

    public void sitOnBranch() {
        System.out.println("Running in the public method sitOnBranch");
    }

    public void flyAway() {
        System.out.println("Running in the public method flyAway");
    }
}
