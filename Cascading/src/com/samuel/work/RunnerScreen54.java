package com.samuel.work;

public class RunnerScreen54 {
    public static void main(String[] args) {
        Screen54 screen = new Screen54();
        screen.display(); // PARENT CLASS METHOD

        Screen54 lcd = new LCDScreen54();
        lcd.display(); // RUNTIME POLYMORPHISM

        LCDScreen54 lcdScreen = new LCDScreen54();
        lcdScreen.display(); // CHILD CLASS METHOD
        lcdScreen.adjustBrightness();

        DisplayStation station = new DisplayStation();
        station.show(screen);
        station.show(lcdScreen);
    }
}
