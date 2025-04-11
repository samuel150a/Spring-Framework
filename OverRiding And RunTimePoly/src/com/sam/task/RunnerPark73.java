package com.sam.task;

public class RunnerPark73 {
    public static void main(String[] args) {
        Park73 park = new Park73();
        park.openGate();

        Park73 p = new Slidder();
        p.openGate();

        Slidder slidder = new Slidder();
        slidder.climbLadder();
        slidder.slideDown();
    }
}
