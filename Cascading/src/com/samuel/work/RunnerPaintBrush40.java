package com.samuel.work;

public class RunnerPaintBrush40 {
    public static void main(String[] args) {
        PaintBrush40 brush = new PaintBrush40();
        brush.paint(); // NORMALLY ACCESSING PARENT CLASS METHOD

        PaintBrush40 fineTipBrush = new FineTipBrush40();
        fineTipBrush.paint(); // RUNTIME POLYMORPHISM

        FineTipBrush40 ftb40 = new FineTipBrush40();
        ftb40.paint(); // NORMALLY ACCESSING CHILD CLASS METHOD
        ftb40.addDetails();

        BrushHolder holder = new BrushHolder();
        holder.show(brush);
        holder.show(ftb40);
    }
}
