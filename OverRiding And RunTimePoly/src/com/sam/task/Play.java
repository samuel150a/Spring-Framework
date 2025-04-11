package com.sam.task;

public class Play extends Game89 {
    public Play() {
        System.out.println("Running in the Play constructor");
    }

    @Override
    public void loadGame() {
        System.out.println("Running in the overridden method loadGame from Play");
    }

    public void startGame() {
        System.out.println("Running in the public method startGame");
    }

    public void endGame() {
        System.out.println("Running in the public method endGame");
    }
}
