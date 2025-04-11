package com.sam.task;

public class RunnerPen71 {
    public static void main(String[] args) {
        Pen71 pen = new Pen71();
        pen.openCap();

        Pen71 p = new Write1();
        p.openCap();

        Write1 write = new Write1();
        write.drawLine();
        write.signName();
    }
}
