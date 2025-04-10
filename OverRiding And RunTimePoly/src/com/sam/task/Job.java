package com.sam.task;

public class Job extends Education16 {
    public Job() {
        System.out.println("Running in the Job constructor");
    }

    @Override
    public void learn() {
        System.out.println("Running in the public method learn after implementation");
    }

    public void earn() {
        System.out.println("Running in the public method earn");
    }

    public void grow() {
        System.out.println("Running in the public method grow");
    }
}
