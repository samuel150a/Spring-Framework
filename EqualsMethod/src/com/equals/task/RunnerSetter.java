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
        Munch17 munch1 = new Munch17();
        munch1.setFlavor("Chocolate");
        munch1.setWeight(12);
        munch1.setPrice(10);
        munch1.setWrapperColor("Purple");

        Munch17 munch2 = new Munch17();
        munch2.setFlavor("Chocolate");
        munch2.setWeight(12);
        munch2.setPrice(10);
        munch2.setWrapperColor("Purple");

        Munch17 munch3 = new Munch17();
        munch3.setFlavor("Caramel");
        munch3.setWeight(20);
        munch3.setPrice(15);
        munch3.setWrapperColor("Red");

        boolean matchMunch = munch1.equals(munch2);
        boolean notMatchMunch = munch3.equals(munch2);
        System.out.println("munch matched: " + matchMunch);
        System.out.println("munch not matched: " + notMatchMunch);

        System.out.println(munch1);
        System.out.println(munch2);
        System.out.println(munch3);
        System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");


        Diode18 diode1 = new Diode18();
        diode1.setType("Zener");
        diode1.setVoltage(5);
        diode1.setCurrentRating(0.5);
        diode1.setPackageType("DO-41");

        Diode18 diode2 = new Diode18();
        diode2.setType("Zener");
        diode2.setVoltage(5);
        diode2.setCurrentRating(0.5);
        diode2.setPackageType("DO-41");

        Diode18 diode3 = new Diode18();
        diode3.setType("Schottky");
        diode3.setVoltage(3);
        diode3.setCurrentRating(1.0);
        diode3.setPackageType("SMA");

        boolean matchDiode = diode1.equals(diode2);
        boolean notMatchDiode = diode3.equals(diode2);
        System.out.println("diode matched: " + matchDiode);
        System.out.println("diode not matched: " + notMatchDiode);

        System.out.println(diode1);
        System.out.println(diode2);
        System.out.println(diode3);
        System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");

        Fuse19 fuse1 = new Fuse19();
        fuse1.setMaterial("Ceramic");
        fuse1.setCurrentLimit(10);
        fuse1.setVoltageRating("250V");
        fuse1.setSize("5x20mm");

        Fuse19 fuse2 = new Fuse19();
        fuse2.setMaterial("Ceramic");
        fuse2.setCurrentLimit(10);
        fuse2.setVoltageRating("250V");
        fuse2.setSize("5x20mm");

        Fuse19 fuse3 = new Fuse19();
        fuse3.setMaterial("Glass");
        fuse3.setCurrentLimit(5);
        fuse3.setVoltageRating("125V");
        fuse3.setSize("6x30mm");

        boolean matchFuse = fuse1.equals(fuse2);
        boolean notMatchFuse = fuse3.equals(fuse2);
        System.out.println("fuse matched: " + matchFuse);
        System.out.println("fuse not matched: " + notMatchFuse);

        System.out.println(fuse1);
        System.out.println(fuse2);
        System.out.println(fuse3);
        System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");

        Tire20 tire1 = new Tire20();
        tire1.setBrand("Michelin");
        tire1.setSize("225/45R17");
        tire1.setType("All-Season");
        tire1.setPrice(150);

        Tire20 tire2 = new Tire20();
        tire2.setBrand("Michelin");
        tire2.setSize("225/45R17");
        tire2.setType("All-Season");
        tire2.setPrice(150);

        Tire20 tire3 = new Tire20();
        tire3.setBrand("Bridgestone");
        tire3.setSize("205/55R16");
        tire3.setType("Summer");
        tire3.setPrice(120);

        boolean match20 = tire1.equals(tire2);
        boolean notMatch20 = tire3.equals(tire2);
        System.out.println("tire matched: " + match20);
        System.out.println("tire not matched: " + notMatch20);

        System.out.println(tire1);
        System.out.println(tire2);
        System.out.println(tire3);
        System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");

        Processor21 proc1 = new Processor21();
        proc1.setBrand("Intel");
        proc1.setModel("i7-10700K");
        proc1.setCores(8);
        proc1.setFrequency(3.8);

        Processor21 proc2 = new Processor21();
        proc2.setBrand("Intel");
        proc2.setModel("i7-10700K");
        proc2.setCores(8);
        proc2.setFrequency(3.8);

        Processor21 proc3 = new Processor21();
        proc3.setBrand("AMD");
        proc3.setModel("Ryzen 5 3600");
        proc3.setCores(6);
        proc3.setFrequency(3.6);

        boolean match21 = proc1.equals(proc2);
        boolean notMatch21 = proc3.equals(proc2);
        System.out.println("processor matched: " + match21);
        System.out.println("processor not matched: " + notMatch21);

        System.out.println(proc1);
        System.out.println(proc2);
        System.out.println(proc3);
        System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");

        Intel22 intel1 = new Intel22();
        intel1.setGeneration("12th Gen");
        intel1.setSeries("Core i5");
        intel1.setCores(6);
        intel1.setSpeed(3.9);

        Intel22 intel2 = new Intel22();
        intel2.setGeneration("12th Gen");
        intel2.setSeries("Core i5");
        intel2.setCores(6);
        intel2.setSpeed(3.9);

        Intel22 intel3 = new Intel22();
        intel3.setGeneration("11th Gen");
        intel3.setSeries("Core i7");
        intel3.setCores(8);
        intel3.setSpeed(3.5);

        boolean match22 = intel1.equals(intel2);
        boolean notMatch22 = intel3.equals(intel2);
        System.out.println("intel matched: " + match22);
        System.out.println("intel not matched: " + notMatch22);

        System.out.println(intel1);
        System.out.println(intel2);
        System.out.println(intel3);
        System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");

        Ryzen23 ryzen1 = new Ryzen23();
        ryzen1.setModel("Ryzen 5 5600X");
        ryzen1.setCores(6);
        ryzen1.setThreads(12);
        ryzen1.setBaseClock(3.7);

        Ryzen23 ryzen2 = new Ryzen23();
        ryzen2.setModel("Ryzen 5 5600X");
        ryzen2.setCores(6);
        ryzen2.setThreads(12);
        ryzen2.setBaseClock(3.7);

        Ryzen23 ryzen3 = new Ryzen23();
        ryzen3.setModel("Ryzen 7 5800X");
        ryzen3.setCores(8);
        ryzen3.setThreads(16);
        ryzen3.setBaseClock(3.8);

        boolean match23 = ryzen1.equals(ryzen2);
        boolean notMatch23 = ryzen3.equals(ryzen2);
        System.out.println("ryzen matched: " + match23);
        System.out.println("ryzen not matched: " + notMatch23);

        System.out.println(ryzen1);
        System.out.println(ryzen2);
        System.out.println(ryzen3);
        System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");

        Nvidia24 gpu1 = new Nvidia24();
        gpu1.setModel("RTX 3060");
        gpu1.setMemory(12);
        gpu1.setSeries("RTX 30");
        gpu1.setClockSpeed(1.78);

        Nvidia24 gpu2 = new Nvidia24();
        gpu2.setModel("RTX 3060");
        gpu2.setMemory(12);
        gpu2.setSeries("RTX 30");
        gpu2.setClockSpeed(1.78);

        Nvidia24 gpu3 = new Nvidia24();
        gpu3.setModel("RTX 3080");
        gpu3.setMemory(10);
        gpu3.setSeries("RTX 30");
        gpu3.setClockSpeed(1.71);

        boolean match24 = gpu1.equals(gpu2);
        boolean notMatch24 = gpu3.equals(gpu2);
        System.out.println("nvidia matched: " + match24);
        System.out.println("nvidia not matched: " + notMatch24);

        System.out.println(gpu1);
        System.out.println(gpu2);
        System.out.println(gpu3);
        System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");

        SSD25 ssd1 = new SSD25();
        ssd1.setBrand("WD");
        ssd1.setCapacity(1000);
        ssd1.setType("NVMe");
        ssd1.setWriteSpeed(3200);

        SSD25 ssd2 = new SSD25();
        ssd2.setBrand("WD");
        ssd2.setCapacity(1000);
        ssd2.setType("NVMe");
        ssd2.setWriteSpeed(3200);

        SSD25 ssd3 = new SSD25();
        ssd3.setBrand("Kingston");
        ssd3.setCapacity(500);
        ssd3.setType("SATA");
        ssd3.setWriteSpeed(500);

        boolean match25 = ssd1.equals(ssd2);
        boolean notMatch25 = ssd3.equals(ssd2);
        System.out.println("ssd matched: " + match25);
        System.out.println("ssd not matched: " + notMatch25);

        System.out.println(ssd1);
        System.out.println(ssd2);
        System.out.println(ssd3);
        System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");
        GpuCooler26 cooler1 = new GpuCooler26();
        cooler1.setBrand("Cooler Master");
        cooler1.setType("Air");
        cooler1.setFanCount(2);
        cooler1.setNoiseLevel(24.5);

        GpuCooler26 cooler2 = new GpuCooler26();
        cooler2.setBrand("Cooler Master");
        cooler2.setType("Air");
        cooler2.setFanCount(2);
        cooler2.setNoiseLevel(24.5);

        GpuCooler26 cooler3 = new GpuCooler26();
        cooler3.setBrand("Noctua");
        cooler3.setType("Liquid");
        cooler3.setFanCount(1);
        cooler3.setNoiseLevel(18.0);

        boolean match26 = cooler1.equals(cooler2);
        boolean notMatch26 = cooler3.equals(cooler2);
        System.out.println("gpucooler matched: " + match26);
        System.out.println("gpucooler not matched: " + notMatch26);

        System.out.println(cooler1);
        System.out.println(cooler2);
        System.out.println(cooler3);
        System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");
    }
}

