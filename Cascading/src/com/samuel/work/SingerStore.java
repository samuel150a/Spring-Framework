package com.samuel.work;

public class SingerStore {
    public SingerStore() {
        System.out.println("Running the SingerStore constructor");
    }

    public void show(Singer94 singer) {
        if (singer != null) {
            singer.sing();
            if (singer instanceof PopSinger94) {
                PopSinger94 ref = (PopSinger94) singer;
                ref.perform();
            } else {
                System.out.println("Singer94 is not an instance of PopSinger94, cannot call cascaded method");
            }
        } else {
            System.out.println("Singer94 is null");
        }
    }
}
