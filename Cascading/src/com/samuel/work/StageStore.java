package com.samuel.work;

public class StageStore {
    public StageStore() {
        System.out.println("Running the StageStore constructor");
    }

    public void show(Stage93 stage) {
        if (stage != null) {
            stage.setUp();
            if (stage instanceof ConcertStage93) {
                ConcertStage93 ref = (ConcertStage93) stage;
                ref.setLighting();
            } else {
                System.out.println("Stage93 is not an instance of ConcertStage93, cannot call cascaded method");
            }
        } else {
            System.out.println("Stage93 is null");
        }
    }
}
