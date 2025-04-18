package com.equals.task;

public class RunnerConstructor {
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


        System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");


        Cotton2 cotton1 = new Cotton2("Organic", "White", 5.5, "John");
        Cotton2 cotton2 = new Cotton2("Organic", "White", 5.5, "John");
        Cotton2 cotton3 = new Cotton2("Synthetic", "Blue", 4.0, "Alice");

        boolean match1 = cotton1.equals(cotton2);
        boolean notmatch1 = cotton3.equals(cotton1);

        System.out.println("cotton matched " + match1);
        System.out.println("cotton notmatched " + notmatch1);

        System.out.println(cotton1);
        System.out.println(cotton2);
        System.out.println(cotton3);
        System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");


        Cell3 cell1 = new Cell3("Samsung", "Galaxy S21", 128, "John");
        Cell3 cell2 = new Cell3("Samsung", "Galaxy S21", 128, "John");
        Cell3 cell3 = new Cell3("Apple", "iPhone 13", 256, "Emma");

        boolean match2 = cell1.equals(cell2);
        boolean notmatch2 = cell3.equals(cell2);

        System.out.println("cell matched " + match2);
        System.out.println("cell not matched " + notmatch2);

        System.out.println(cell1);
        System.out.println(cell2);
        System.out.println(cell3);

        System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");

    }
}
