package com.samuel.work;

public class ConcertAuditorium92 extends Auditorium92 {
    public ConcertAuditorium92() {
        System.out.println("Running in the ConcertAuditorium92 constructor");
    }

    @Override
    public void hostEvent() {
        System.out.println("Running public method hostEvent by child class");
    }

    public void playMusic() {
        System.out.println("Running in public method playMusic");
    }
}
