package com.samuel.work;

public class RunnerStage93 {
    public static void main(String[] args) {
        Stage93 stage = new Stage93();
        stage.setUp(); // PARENT CLASS METHOD

        Stage93 concertStage = new ConcertStage93();
        concertStage.setUp(); // RUNTIME POLYMORPHISM

        ConcertStage93 cs = new ConcertStage93();
        cs.setUp(); // CHILD CLASS METHOD
        cs.setLighting();

        StageStore store = new StageStore();
        store.show(stage);
        store.show(cs);
    }
}
