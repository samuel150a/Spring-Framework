package com.Runner;


import com.xworkz.KarnatakaBandhExeption;

public class KarnatakaBandhExeptionRunner {

    public static void main(String args[]) throws KarnatakaBandhExeption {

        boolean info = false;


        if(info) {
            System.out.println("bandh ");

        } else {
            throw new KarnatakaBandhExeption("no bandh");
        }
    }
}

