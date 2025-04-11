package com.sam.task;

public class Wave extends Ocean85 {
    public Wave() {
        System.out.println("Running in the Wave constructor");
    }

    @Override
    public void showDepth() {
        System.out.println("Running in the overridden method showDepth from Wave");
    }

    public void crashOnShore() {
        System.out.println("Running in the public method crashOnShore");
    }

    public void riseHigh() {
        System.out.println("Running in the public method riseHigh");
    }
}
