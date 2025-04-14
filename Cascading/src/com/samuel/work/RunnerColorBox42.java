package com.samuel.work;

public class RunnerColorBox42 {
    public static void main(String[] args) {
        ColorBox42 box = new ColorBox42();
        box.openBox(); // NORMALLY ACCESSING PARENT CLASS METHOD

        ColorBox42 wcBox = new WaterColorBox42();
        wcBox.openBox(); // RUNTIME POLYMORPHISM

        WaterColorBox42 wc42 = new WaterColorBox42();
        wc42.openBox(); // NORMALLY ACCESSING CHILD CLASS METHOD
        wc42.useBrush();

        BoxHolder holder = new BoxHolder();
        holder.show(box);
        holder.show(wc42);
    }
}
