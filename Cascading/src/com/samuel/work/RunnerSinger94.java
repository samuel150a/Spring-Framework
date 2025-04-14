package com.samuel.work;

public class RunnerSinger94 {
    public static void main(String[] args) {
        Singer94 singer = new Singer94();
        singer.sing(); // PARENT CLASS METHOD

        Singer94 popSinger = new PopSinger94();
        popSinger.sing(); // RUNTIME POLYMORPHISM

        PopSinger94 ps = new PopSinger94();
        ps.sing(); // CHILD CLASS METHOD
        ps.perform();

        SingerStore store = new SingerStore();
        store.show(singer);
        store.show(ps);
    }
}
