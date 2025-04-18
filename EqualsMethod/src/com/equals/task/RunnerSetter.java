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




        Mobile mobile1=new Mobile();
        mobile1.setmadein("india");
        mobile1.setpixel(50);
        mobile1.setchargerpin("c");
        mobile1.setcurved(true);

        Mobile mobile2=new Mobile();
        mobile2.setmadein("india");
        mobile2.setpixel(50);
        mobile2.setchargerpin("c");
        mobile2.setcurved(true);

        Mobile mobile3=new Mobile();
        mobile3.setmadein("korea");
        mobile3.setpixel(60);
        mobile3.setchargerpin("c");
        mobile3.setcurved(false);


        Boolean match2=match1.equals(mobile2);
        Boolean notmatch2=mobile3.equals(match2);
        System.out.println("mobile is matched "+ match);
        System.out.println("mobile is not match "+ notmatch);

        System.out.println(mobile1);
        System.out.println(mobile2);
        System.out.println(mobile3);

        System.out.println("###########################################################################");

        Lamp4 lamp1=new Lamp4();
        lamp1.setcompany("pih");
        lamp1.setcost(1120);
        lamp1.setbrought("amazon");
        lamp1.setportable(true);

        Lamp4 lamp2=new Lamp4();
        lamp2.setcompany("pih");
        lamp2.setcost(1120);
        lamp2.setbrought("amazon");
        lamp2.setportable(true);


        Lamp4 lamp3=new Lamp4();
        lamp3.setcompany("h");
        lamp3.setcost(2000);
        lamp3.setbrought("flipkart");
        lamp3.setportable(false);

        boolean match3=lamp1.equals(lamp2);
        boolean notmatch3=lamp3.equals(lamp2);
        System.out.println("lamp is matched "+ match);
        System.out.println("lamp is not match "+ notmatch);

        System.out.println(lamp1);
        System.out.println(lamp2);
        System.out.println(lamp3);

        System.out.println("###########################################################################");
        Furniture5 furniture1 = new Furniture5();
        furniture1.setMaterial("Wood");
        furniture1.setColor("Brown");
        furniture1.setPrice(5000);
        furniture1.setType("Chair");

        Furniture5 furniture2 = new Furniture5();
        furniture2.setMaterial("Wood");
        furniture2.setColor("Brown");
        furniture2.setPrice(5000);
        furniture2.setType("Chair");

        Furniture5 furniture3 = new Furniture5();
        furniture3.setMaterial("Metal");
        furniture3.setColor("Black");
        furniture3.setPrice(7000);
        furniture3.setType("Table");

        boolean match5 = furniture1.equals(furniture2);
        boolean notmatch5 = furniture3.equals(furniture2);
        System.out.println("furniture matched: " + match5);
        System.out.println("furniture not matched: " + notmatch5);

        System.out.println(furniture1);
        System.out.println(furniture2);
        System.out.println(furniture3);
        System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");
        Zip6 zip1 = new Zip6();
        zip1.setBrand("YKK");
        zip1.setColor("Black");
        zip1.setSize(10);
        zip1.setType("Plastic");

        Zip6 zip2 = new Zip6();
        zip2.setBrand("YKK");
        zip2.setColor("Black");
        zip2.setSize(10);
        zip2.setType("Plastic");

        Zip6 zip3 = new Zip6();
        zip3.setBrand("SBS");
        zip3.setColor("Silver");
        zip3.setSize(8);
        zip3.setType("Metal");

        boolean match6 = zip1.equals(zip2);
        boolean notmatch6 = zip3.equals(zip2);
        System.out.println("zip matched: " + match6);
        System.out.println("zip not matched: " + notmatch6);

        System.out.println(zip1);
        System.out.println(zip2);
        System.out.println(zip3);
        System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");


        Bluetooth7 bluetooth1 = new Bluetooth7();
        bluetooth1.setBrand("Boat");
        bluetooth1.setColor("Black");
        bluetooth1.setVersion(5);
        bluetooth1.setType("Wireless");

        Bluetooth7 bluetooth2 = new Bluetooth7();
        bluetooth2.setBrand("Boat");
        bluetooth2.setColor("Black");
        bluetooth2.setVersion(5);
        bluetooth2.setType("Wireless");

        Bluetooth7 bluetooth3 = new Bluetooth7();
        bluetooth3.setBrand("JBL");
        bluetooth3.setColor("Blue");
        bluetooth3.setVersion(4);
        bluetooth3.setType("Wired");

        boolean match7 = bluetooth1.equals(bluetooth2);
        boolean notmatch7 = bluetooth3.equals(bluetooth2);
        System.out.println("bluetooth matched: " + match7);
        System.out.println("bluetooth not matched: " + notmatch7);

        System.out.println(bluetooth1);
        System.out.println(bluetooth2);
        System.out.println(bluetooth3);
        System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");


        Resistor8 resistor1 = new Resistor8();
        resistor1.setMaterial("Carbon");
        resistor1.setColorCode("Brown-Black-Red");
        resistor1.setResistance(1000);
        resistor1.setType("Fixed");

        Resistor8 resistor2 = new Resistor8();
        resistor2.setMaterial("Carbon");
        resistor2.setColorCode("Brown-Black-Red");
        resistor2.setResistance(1000);
        resistor2.setType("Fixed");

        Resistor8 resistor3 = new Resistor8();
        resistor3.setMaterial("Metal");
        resistor3.setColorCode("Red-Red-Orange");
        resistor3.setResistance(22000);
        resistor3.setType("Variable");

        boolean match8 = resistor1.equals(resistor2);
        boolean notmatch8 = resistor3.equals(resistor2);
        System.out.println("resistor matched: " + match8);
        System.out.println("resistor not matched: " + notmatch8);

        System.out.println(resistor1);
        System.out.println(resistor2);
        System.out.println(resistor3);
        System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");
    }
}
