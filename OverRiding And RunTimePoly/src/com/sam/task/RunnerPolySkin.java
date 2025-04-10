package com.sam.task;

public class RunnerPolySkin {
    public static void main(String[] args)
    {
        Skin skin=new Skin();
        skin.Colors(); //  no run time// poly


        Skin skin1=new Cells();
        skin1.Colors(); // happens run time poly here based on jvm decision


         Cells cells=new Cells();
        cells.SkinCream();
        cells.SkinTemp();

    }
}
