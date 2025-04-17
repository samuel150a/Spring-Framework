package com.equals.task;

public class LuggageRunner {
    public static void main(String[] args) {
       Luggage luggage1=new Luggage("puma","red",2,"sam");
        Luggage luggage2=new Luggage("puma","red",2,"sam");
        Luggage luggage3=new Luggage("bolt","black",3,"Alice");


        boolean match = luggage1.equals(luggage2);
        boolean notmatch=luggage3.equals(luggage2);
        System.out.println("luggage matched " + match);
        System.out.println("luggage not matched " +notmatch);


        System.out.println(luggage1);
        System.out.println(luggage2);
        System.out.println(luggage3);
    }
}
