package com.samuel.work;

public class OilCanvas39 extends Canvas39 {
    public OilCanvas39() {
        System.out.println("Running in the OilCanvas39 constructor");
    }

    @Override
    public void paint() {
        System.out.println("Running public method paint by child class");
    }

    public void blendColors() {
        System.out.println("Running in public method blendColors");
    }
}
