package com.samuel.work;

public class AuditoriumStore {
    public AuditoriumStore() {
        System.out.println("Running the AuditoriumStore constructor");
    }

    public void show(Auditorium92 auditorium) {
        if (auditorium != null) {
            auditorium.hostEvent();
            if (auditorium instanceof ConcertAuditorium92) {
                ConcertAuditorium92 ref = (ConcertAuditorium92) auditorium;
                ref.playMusic();
            } else {
                System.out.println("Auditorium92 is not an instance of ConcertAuditorium92, cannot call cascaded method");
            }
        } else {
            System.out.println("Auditorium92 is null");
        }
    }
}
