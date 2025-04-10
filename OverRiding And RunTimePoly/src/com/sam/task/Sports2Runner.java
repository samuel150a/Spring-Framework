package com.sam.task;

public class Sports2Runner {

        public static void main(String[] args)
        {

            Sports3 sports3 =new Sports3();
            sports3.indoor();

            Sports3 sports=new Cricket3();
            sports.indoor();   // run time poly

            Cricket3 cricket3=new Cricket3();
            cricket3.ball();
            cricket3.bat();
        }
    }


