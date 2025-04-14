package com.samuel.work;

public class RunnerLotion59 {
    public static void main(String[] args) {
        Lotion59 lotion = new Lotion59();
        lotion.apply(); // PARENT CLASS METHOD

        Lotion59 bodyLotion = new BodyLotion59();
        bodyLotion.apply(); // RUNTIME POLYMORPHISM

        BodyLotion59 blotion = new BodyLotion59();
        blotion.apply(); // CHILD CLASS METHOD
        blotion.moisturizeSkin();

        SkinCareCenter center = new SkinCareCenter();
        center.show(lotion);
        center.show(blotion);
    }
}
