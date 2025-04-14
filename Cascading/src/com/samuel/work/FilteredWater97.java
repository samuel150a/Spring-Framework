package com.samuel.work;

public class FilteredWater97 extends Water97 {
    public FilteredWater97() {
        System.out.println("Running in the FilteredWater97 constructor");
    }

    @Override
    public void drink() {
        System.out.println("Running public method drink by child class");
    }

    public void filter() {
        System.out.println("Running in public method filter");
    }
}
