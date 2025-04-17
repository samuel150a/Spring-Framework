package com.equals.task;

public class BookRunner {
    public static void main(String[] args) {
        Book book1=new Book();
        book1.setpages(200);
        book1.settype("long");
        book1.setcost(72);
        book1.setshop("Ambbe");

        Book book2 =new Book();
        book2.setpages(200);
        book2.settype("long");
        book2.setcost(72);
        book2.setshop("Ambbe");

        Book book3=new Book();
        book3.setpages(150);
        book3.settype("Short");
        book3.setcost(55);
        book3.setshop("devi");


        Boolean match=book1.equals(book2);
        Boolean notmatch=book3.equals(book2);
        System.out.println("book is matched "+ match);
        System.out.println("book is not match "+ notmatch);

        System.out.println(book1);
        System.out.println(book2);
        System.out.println(book3);









    }
}
