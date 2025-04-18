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


        Battery9 battery1 = new Battery9();
        battery1.setBrand("Duracell");
        battery1.setType("AA");
        battery1.setCapacity(2500);
        battery1.setVoltage("1.5V");

        Battery9 battery2 = new Battery9();
        battery2.setBrand("Duracell");
        battery2.setType("AA");
        battery2.setCapacity(2500);
        battery2.setVoltage("1.5V");

        Battery9 battery3 = new Battery9();
        battery3.setBrand("Energizer");
        battery3.setType("AAA");
        battery3.setCapacity(1000);
        battery3.setVoltage("1.2V");

        boolean match9 = battery1.equals(battery2);
        boolean notmatch9 = battery3.equals(battery2);
        System.out.println("battery matched: " + match9);
        System.out.println("battery not matched: " + notmatch9);

        System.out.println(battery1);
        System.out.println(battery2);
        System.out.println(battery3);
        System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");


        Sensor10 sensor1 = new Sensor10();
        sensor1.setName("DHT11");
        sensor1.setCategory("Temperature");
        sensor1.setRange(50);
        sensor1.setUnit("Celsius");

        Sensor10 sensor2 = new Sensor10();
        sensor2.setName("DHT11");
        sensor2.setCategory("Temperature");
        sensor2.setRange(50);
        sensor2.setUnit("Celsius");

        Sensor10 sensor3 = new Sensor10();
        sensor3.setName("MQ2");
        sensor3.setCategory("Gas");
        sensor3.setRange(100);
        sensor3.setUnit("PPM");

        boolean match10 = sensor1.equals(sensor2);
        boolean notmatch10 = sensor3.equals(sensor2);
        System.out.println("sensor matched: " + match10);
        System.out.println("sensor not matched: " + notmatch10);

        System.out.println(sensor1);
        System.out.println(sensor2);
        System.out.println(sensor3);
        System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");

        Drone11 drone1 = new Drone11();
        drone1.setModel("Phantom 4");
        drone1.setBrand("DJI");
        drone1.setFlightTime(30);
        drone1.setCameraQuality("4K");

        Drone11 drone2 = new Drone11();
        drone2.setModel("Phantom 4");
        drone2.setBrand("DJI");
        drone2.setFlightTime(30);
        drone2.setCameraQuality("4K");

        Drone11 drone3 = new Drone11();
        drone3.setModel("Mavic Mini");
        drone3.setBrand("DJI");
        drone3.setFlightTime(20);
        drone3.setCameraQuality("2.7K");

        boolean match11 = drone1.equals(drone2);
        boolean notmatch11 = drone3.equals(drone2);
        System.out.println("drone matched: " + match11);
        System.out.println("drone not matched: " + notmatch11);

        System.out.println(drone1);
        System.out.println(drone2);
        System.out.println(drone3);
        System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");
        Dvd12 dvd1 = new Dvd12();
        dvd1.setTitle("Inception");
        dvd1.setGenre("Sci-Fi");
        dvd1.setDuration(148);
        dvd1.setLanguage("English");

        Dvd12 dvd2 = new Dvd12();
        dvd2.setTitle("Inception");
        dvd2.setGenre("Sci-Fi");
        dvd2.setDuration(148);
        dvd2.setLanguage("English");

        Dvd12 dvd3 = new Dvd12();
        dvd3.setTitle("Bahubali");
        dvd3.setGenre("Action");
        dvd3.setDuration(160);
        dvd3.setLanguage("Telugu");

        boolean match12 = dvd1.equals(dvd2);
        boolean notmatch12 = dvd3.equals(dvd2);
        System.out.println("dvd matched: " + match12);
        System.out.println("dvd not matched: " + notmatch12);

        System.out.println(dvd1);
        System.out.println(dvd2);
        System.out.println(dvd3);
        System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");

        Phone13 phone1 = new Phone13();
        phone1.setBrand("Samsung");
        phone1.setModel("Galaxy S22");
        phone1.setRam(8);
        phone1.setOs("Android");

        Phone13 phone2 = new Phone13();
        phone2.setBrand("Samsung");
        phone2.setModel("Galaxy S22");
        phone2.setRam(8);
        phone2.setOs("Android");

        Phone13 phone3 = new Phone13();
        phone3.setBrand("Apple");
        phone3.setModel("iPhone 13");
        phone3.setRam(6);
        phone3.setOs("iOS");

        boolean match13 = phone1.equals(phone2);
        boolean notmatch13 = phone3.equals(phone2);
        System.out.println("phone matched: " + match13);
        System.out.println("phone not matched: " + notmatch13);

        System.out.println(phone1);
        System.out.println(phone2);
        System.out.println(phone3);
        System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");

        Tv13 tv1 = new Tv13();
        tv1.setBrand("Sony");
        tv1.setScreenType("LED");
        tv1.setSize(55);
        tv1.setResolution("4K");

        Tv13 tv2 = new Tv13();
        tv2.setBrand("Sony");
        tv2.setScreenType("LED");
        tv2.setSize(55);
        tv2.setResolution("4K");

        Tv13 tv3 = new Tv13();
        tv3.setBrand("LG");
        tv3.setScreenType("OLED");
        tv3.setSize(65);
        tv3.setResolution("8K");

        boolean matchTv = tv1.equals(tv2);
        boolean notMatchTv = tv3.equals(tv2);
        System.out.println("tv matched: " + matchTv);
        System.out.println("tv not matched: " + notMatchTv);

        System.out.println(tv1);
        System.out.println(tv2);
        System.out.println(tv3);
        System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");
        Speaker14 speaker1 = new Speaker14();
        speaker1.setBrand("JBL");
        speaker1.setPowerOutput(40);
        speaker1.setType("Portable");
        speaker1.setBluetoothSupport(true);

        Speaker14 speaker2 = new Speaker14();
        speaker2.setBrand("JBL");
        speaker2.setPowerOutput(40);
        speaker2.setType("Portable");
        speaker2.setBluetoothSupport(true);

        Speaker14 speaker3 = new Speaker14();
        speaker3.setBrand("Sony");
        speaker3.setPowerOutput(60);
        speaker3.setType("Home Theater");
        speaker3.setBluetoothSupport(false);

        boolean matchSpeaker = speaker1.equals(speaker2);
        boolean notMatchSpeaker = speaker3.equals(speaker2);
        System.out.println("speaker matched: " + matchSpeaker);
        System.out.println("speaker not matched: " + notMatchSpeaker);

        System.out.println(speaker1);
        System.out.println(speaker2);
        System.out.println(speaker3);
        System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");


        Map15 map1 = new Map15();
        map1.setName("World Map");
        map1.setRegion("Global");
        map1.setScale(1000000);
        map1.setType("Political");

        Map15 map2 = new Map15();
        map2.setName("World Map");
        map2.setRegion("Global");
        map2.setScale(1000000);
        map2.setType("Political");

        Map15 map3 = new Map15();
        map3.setName("India Map");
        map3.setRegion("Asia");
        map3.setScale(500000);
        map3.setType("Physical");

        boolean matchMap = map1.equals(map2);
        boolean notMatchMap = map3.equals(map2);
        System.out.println("map matched: " + matchMap);
        System.out.println("map not matched: " + notMatchMap);

        System.out.println(map1);
        System.out.println(map2);
        System.out.println(map3);
        System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");

        Lays16 lays1 = new Lays16();
        lays1.setFlavor("Classic Salted");
        lays1.setWeight(50);
        lays1.setPrice(20);
        lays1.setPackType("Pouch");

        Lays16 lays2 = new Lays16();
        lays2.setFlavor("Classic Salted");
        lays2.setWeight(50);
        lays2.setPrice(20);
        lays2.setPackType("Pouch");

        Lays16 lays3 = new Lays16();
        lays3.setFlavor("Magic Masala");
        lays3.setWeight(90);
        lays3.setPrice(30);
        lays3.setPackType("Canister");

        boolean matchLays = lays1.equals(lays2);
        boolean notMatchLays = lays3.equals(lays2);
        System.out.println("lays matched: " + matchLays);
        System.out.println("lays not matched: " + notMatchLays);

        System.out.println(lays1);
        System.out.println(lays2);
        System.out.println(lays3);
        System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");

    }
}

