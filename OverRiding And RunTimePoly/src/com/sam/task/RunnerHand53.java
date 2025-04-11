package com.sam.task;

public class RunnerHand53 {
    public static void main(String[] args) {
        Hand53 hand = new Hand53();
        hand.hold();

        Hand53 h = new Grip();
        h.hold();

        Grip grip = new Grip();
        grip.catchItem();
        grip.releaseItem();
    }
}
