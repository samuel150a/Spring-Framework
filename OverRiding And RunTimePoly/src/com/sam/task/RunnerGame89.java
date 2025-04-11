package com.sam.task;

public class RunnerGame89 {
    public static void main(String[] args) {
        Game89 game = new Game89();
        game.loadGame();

        Game89 g = new Play();
        g.loadGame();

        Play play = new Play();
        play.startGame();
        play.endGame();
    }
}
