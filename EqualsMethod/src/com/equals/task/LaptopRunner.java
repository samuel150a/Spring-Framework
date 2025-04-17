package com.equals.task;

public class LaptopRunner {
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
    }
}
