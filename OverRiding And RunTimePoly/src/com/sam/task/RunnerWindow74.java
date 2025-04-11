package com.sam.task;

public class RunnerWindow74 {
    public static void main(String[] args) {
        Window74 window = new Window74();
        window.unlock();

        Window74 w = new Open();
        w.unlock();

        Open open = new Open();
        open.slideOpen();
        open.closeWindow();
    }
}
