package com.equals.task;

public class RunnerSetter {
    public static void main(String[] args) {
        Laptop laptop1 = new Laptop();
        laptop1.setBrand("Dell");
        laptop1.setColor("Black");
        laptop1.setRam(16);
        laptop1.setOwner("Alice");

        Laptop laptop2 = new Laptop();
        laptop2.setBrand("Dell");
        laptop2.setColor("Black");
        laptop2.setRam(16);
        laptop2.setOwner("Alice");

        Laptop laptop3 = new Laptop();
        laptop3.setBrand("hp");
        laptop3.setColor("silver");
        laptop3.setRam(16);
        laptop3.setOwner("sam");


        boolean match = laptop1.equals(laptop2);
        boolean notmatch=laptop3.equals(laptop2);
        System.out.println("laptop matched " + match);
        System.out.println("laptop not matched " +notmatch);


        System.out.println(laptop1);
        System.out.println(laptop2);
        System.out.println(laptop3);

        System.out.println("###########################################################################");

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


        Boolean match1=book1.equals(book2);
        Boolean notmatch1=book3.equals(book2);
        System.out.println("book is matched "+ match);
        System.out.println("book is not match "+ notmatch);

        System.out.println(book1);
        System.out.println(book2);
        System.out.println(book3);

        System.out.println("###########################################################################");


    }
}
