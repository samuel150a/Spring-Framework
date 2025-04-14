package com.samuel.work;

public class RunnerAuditorium92 {
    public static void main(String[] args) {
        Auditorium92 auditorium = new Auditorium92();
        auditorium.hostEvent(); // PARENT CLASS METHOD

        Auditorium92 concertAuditorium = new ConcertAuditorium92();
        concertAuditorium.hostEvent(); // RUNTIME POLYMORPHISM

        ConcertAuditorium92 ca = new ConcertAuditorium92();
        ca.hostEvent(); // CHILD CLASS METHOD
        ca.playMusic();

        AuditoriumStore store = new AuditoriumStore();
        store.show(auditorium);
        store.show(ca);
    }
}
