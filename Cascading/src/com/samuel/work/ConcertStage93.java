package com.samuel.work;

public class ConcertStage93 extends Stage93 {
    public ConcertStage93() {
        System.out.println("Running in the ConcertStage93 constructor");
    }

    @Override
    public void setUp() {
        System.out.println("Running public method setUp by child class");
    }

    public void setLighting() {
        System.out.println("Running in public method setLighting");
    }
}
