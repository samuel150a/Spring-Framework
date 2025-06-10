package com.Runner;


import com.xworkz.GameException;

public class GameExceptionRunner {

    public static void main(String args[]) throws GameException {

        boolean won = false;


        if(won) {
            System.out.println(" qualified ");

        } else {
            throw new GameException("not qualified");
        }
    }
}


