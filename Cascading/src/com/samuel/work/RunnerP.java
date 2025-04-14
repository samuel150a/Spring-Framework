package com.samuel.work;

public class RunnerP {
    public static void main(String[] args) {

        TV tv = new TV();
        tv.usetv();     // NORMALLY ACCESSING PARENT CLASS METHOD

       TV ptv = new ProTv();
       ptv.usetv();   // RUN TIME POLY OCCURS


        ProTv proTv = new ProTv();
        proTv.usetv();  //NORMALLY ACCESSING SUB CLASS METHOD
        proTv.maintaintv();


        SonyTV sonyTV = new SonyTV();
        sonyTV.show(tv);
        sonyTV.show(proTv);




    }
}