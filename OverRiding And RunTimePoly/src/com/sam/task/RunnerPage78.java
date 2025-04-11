package com.sam.task;

public class RunnerPage78 {
    public static void main(String[] args) {
        Page78 page = new Page78();
        page.showContent();

        Page78 p = new Turn();
        p.showContent();

        Turn turn = new Turn();
        turn.flipForward();
        turn.flipBackward();
    }
}
