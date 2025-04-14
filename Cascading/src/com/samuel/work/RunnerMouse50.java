package com.samuel.work;

public class RunnerMouse50 {
    public static void main(String[] args) {
        Mouse50 mouse = new Mouse50();
        mouse.click(); // PARENT CLASS METHOD

        Mouse50 gaming = new GamingMouse50();
        gaming.click(); // RUNTIME POLYMORPHISM

        GamingMouse50 gMouse = new GamingMouse50();
        gMouse.click(); // CHILD CLASS METHOD
        gMouse.rgbGlow();

        DeviceShelf shelf = new DeviceShelf();
        shelf.show(mouse);
        shelf.show(gMouse);
    }
}
