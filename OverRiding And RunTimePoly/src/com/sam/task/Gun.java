package com.sam.task;

public class Gun extends Army18 {
    public Gun() {
        System.out.println("Running in the Gun constructor");
    }

    @Override
    public void protectNation() {
        System.out.println("Running in the public method protectNation after implementation");
    }

    public void shoot() {
        System.out.println("Running in the public method shoot");
    }

    public void reload() {
        System.out.println("Running in the public method reload");
    }
}
