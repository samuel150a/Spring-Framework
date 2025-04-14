package com.samuel.work;

public class RunnerCamera64 {
    public static void main(String[] args) {
        Camera64 camera = new Camera64();
        camera.click(); // PARENT CLASS METHOD

        Camera64 dslr = new DslrCamera64();
        dslr.click(); // RUNTIME POLYMORPHISM

        DslrCamera64 dc = new DslrCamera64();
        dc.click(); // CHILD CLASS METHOD
        dc.zoomLens();

        CameraShop shop = new CameraShop();
        shop.show(camera);
        shop.show(dc);
    }
}
