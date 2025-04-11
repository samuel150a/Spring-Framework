package com.sam.task;

public class RunnerChair70 {
    public static void main(String[] args) {
        Chair70 chair = new Chair70();
        chair.support();

        Chair70 c = new Sit();
        c.support();

        Sit sit = new Sit();
        sit.leanBack();
        sit.fold();
    }
}
