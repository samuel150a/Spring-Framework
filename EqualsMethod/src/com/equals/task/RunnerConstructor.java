package com.equals.task;

public class RunnerConstructor {
    public static void main(String[] args)
    {
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


        Fan4 fan1 = new Fan4("Usha", "White", 1200, "Ravi");
        Fan4 fan2 = new Fan4("Usha", "White", 1200, "Ravi");
        Fan4 fan3 = new Fan4("Havells", "Brown", 1000, "Kiran");

        boolean match3 = fan1.equals(fan2);
        boolean notmatch3 = fan3.equals(fan2);

        System.out.println("fan matched " + match3);
        System.out.println("fan not matched " + notmatch3);

        System.out.println(fan1);
        System.out.println(fan2);
        System.out.println(fan3);

        System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");

        Screen5 screen1 = new Screen5("Samsung", "32inch", "1080p", "Ajay");
        Screen5 screen2 = new Screen5("Samsung", "32inch", "1080p", "Ajay");
        Screen5 screen3 = new Screen5("LG", "27inch", "4K", "Sneha");

        boolean match4 = screen1.equals(screen2);
        boolean notmatch4 = screen3.equals(screen2);

        System.out.println("screen matched " + match4);
        System.out.println("screen not matched " + notmatch4);

        System.out.println(screen1);
        System.out.println(screen2);
        System.out.println(screen3);

        System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");

        Bottle6 bottle1 = new Bottle6("Milton", "Blue", 1000, "Anu");
        Bottle6 bottle2 = new Bottle6("Milton", "Blue", 1000, "Anu");
        Bottle6 bottle3 = new Bottle6("Cello", "Red", 750, "Rahul");

        boolean match5 = bottle1.equals(bottle2);
        boolean notmatch5 = bottle3.equals(bottle2);

        System.out.println("bottle matched " + match5);
        System.out.println("bottle not matched " + notmatch5);

        System.out.println(bottle1);
        System.out.println(bottle2);
        System.out.println(bottle3);


        System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");



        Microscope7 micro1 = new Microscope7("Olympus", "Compound", 1000, "Dr. Arjun");
        Microscope7 micro2 = new Microscope7("Olympus", "Compound", 1000, "Dr. Arjun");
        Microscope7 micro3 = new Microscope7("Nikon", "Stereo", 400, "Dr. Priya");

        boolean match6= micro1.equals(micro2);
        boolean notmatch6 = micro3.equals(micro2);

        System.out.println("microscope matched " + match6);
        System.out.println("microscope not matched " + notmatch6);

        System.out.println(micro1);
        System.out.println(micro2);
        System.out.println(micro3);

        System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");

        Mouse8 mouse1 = new Mouse8("Logitech", "Wireless", 1600, "Vikram");
        Mouse8 mouse2 = new Mouse8("Logitech", "Wireless", 1600, "Vikram");
        Mouse8 mouse3 = new Mouse8("HP", "Wired", 1000, "Sneha");

        boolean match7 = mouse1.equals(mouse2);
        boolean notmatch7 = mouse3.equals(mouse2);

        System.out.println("mouse matched " + match7);
        System.out.println("mouse not matched " + notmatch7);

        System.out.println(mouse1);
        System.out.println(mouse2);
        System.out.println(mouse3);

        System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");



        Jacket9 jacket1 = new Jacket9("Nike", "Black", "M", "Sanjay");
        Jacket9 jacket2 = new Jacket9("Nike", "Black", "M", "Sanjay");
        Jacket9 jacket3 = new Jacket9("Adidas", "Blue", "L", "Meera");

        boolean match8 = jacket1.equals(jacket2);
        boolean notmatch8 = jacket3.equals(jacket2);

        System.out.println("jacket matched " + match8);
        System.out.println("jacket not matched " + notmatch8);

        System.out.println(jacket1);
        System.out.println(jacket2);
        System.out.println(jacket3);

        System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
        LED10 led1 = new LED10("Samsung", "42 inch", "4K", "John");
        LED10 led2 = new LED10("Samsung", "42 inch", "4K", "John");
        LED10 led3 = new LED10("LG", "55 inch", "Full HD", "Sara");

        boolean match9 = led1.equals(led2);
        boolean notmatch9 = led3.equals(led2);

        System.out.println("led matched " + match9);
        System.out.println("led not matched " + notmatch9);

        System.out.println(led1);
        System.out.println(led2);
        System.out.println(led3);

        System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");


        Locket11 locket1 = new Locket11("Tanishq", "Gold", "Heart", "Anita");
        Locket11 locket2 = new Locket11("Tanishq", "Gold", "Heart", "Anita");
        Locket11 locket3 = new Locket11("Kalyan", "Silver", "Round", "Priya");

        boolean match10 = locket1.equals(locket2);
        boolean notmatch10 = locket3.equals(locket2);

        System.out.println("locket matched " + match10);
        System.out.println("locket not matched " + notmatch10);

        System.out.println(locket1);
        System.out.println(locket2);
        System.out.println(locket3);

        System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
        Horlicks12 horlicks1 = new Horlicks12("Horlicks", "Chocolate", 500, "Rahul");
        Horlicks12 horlicks2 = new Horlicks12("Horlicks", "Chocolate", 500, "Rahul");
        Horlicks12 horlicks3 = new Horlicks12("Bovonto", "Vanilla", 400, "Priya");

        boolean match11 = horlicks1.equals(horlicks2);
        boolean notmatch11 = horlicks3.equals(horlicks2);

        System.out.println("horlicks matched " + match11);
        System.out.println("horlicks not matched " + notmatch11);

        System.out.println(horlicks1);
        System.out.println(horlicks2);
        System.out.println(horlicks3);

        System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");


        WheyProtein13 protein1 = new WheyProtein13("MyProtein", "Chocolate", 1000, "Arvind");
        WheyProtein13 protein2 = new WheyProtein13("MyProtein", "Chocolate", 1000, "Arvind");
        WheyProtein13 protein3 = new WheyProtein13("Optimum Nutrition", "Vanilla", 1200, "Raj");

        boolean match12 = protein1.equals(protein2);
        boolean notmatch12 = protein3.equals(protein2);

        System.out.println("whey protein matched " + match12);
        System.out.println("whey protein not matched " + notmatch12);

        System.out.println(protein1);
        System.out.println(protein2);
        System.out.println(protein3);

        System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");

        TeaPowder14 tea1 = new TeaPowder14("Tata", "Masala", 500, "Suresh");
        TeaPowder14 tea2 = new TeaPowder14("Tata", "Masala", 500, "Suresh");
        TeaPowder14 tea3 = new TeaPowder14("Tetley", "Lemon", 400, "Maya");

        boolean match13 = tea1.equals(tea2);
        boolean notmatch13 = tea3.equals(tea2);

        System.out.println("tea powder matched " + match13);
        System.out.println("tea powder not matched " + notmatch13);

        System.out.println(tea1);
        System.out.println(tea2);
        System.out.println(tea3);

        System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");


        ChiliPowder15 chili1 = new ChiliPowder15("MDH", "Kashmiri", 250, "Vijay");
        ChiliPowder15 chili2 = new ChiliPowder15("MDH", "Kashmiri", 250, "Vijay");
        ChiliPowder15 chili3 = new ChiliPowder15("Everest", "Byadgi", 500, "Neha");

        boolean match14 = chili1.equals(chili2);
        boolean notmatch14 = chili3.equals(chili2);

        System.out.println("chili powder matched " + match14);
        System.out.println("chili powder not matched " + notmatch14);

        System.out.println(chili1);
        System.out.println(chili2);
        System.out.println(chili3);

        System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
        WashingMachine16 machine1 = new WashingMachine16("LG", "Front Load", 7, "Anil");
        WashingMachine16 machine2 = new WashingMachine16("LG", "Front Load", 7, "Anil");
        WashingMachine16 machine3 = new WashingMachine16("Samsung", "Top Load", 8, "Ravi");

        boolean match15 = machine1.equals(machine2);
        boolean notmatch15 = machine3.equals(machine2);

        System.out.println("washing machine matched " + match15);
        System.out.println("washing machine not matched " + notmatch15);

        System.out.println(machine1);
        System.out.println(machine2);
        System.out.println(machine3);

        System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");

        FryPan17 fryPan1 = new FryPan17("Prestige", "Non-stick", 28, "Sita");
        FryPan17 fryPan2 = new FryPan17("Prestige", "Non-stick", 28, "Sita");
        FryPan17 fryPan3 = new FryPan17("Tefal", "Cast Iron", 30, "Ravi");

        boolean match16 = fryPan1.equals(fryPan2);
        boolean notmatch16 = fryPan3.equals(fryPan2);

        System.out.println("fry pan matched " + match16);
        System.out.println("fry pan not matched " + notmatch16);

        System.out.println(fryPan1);
        System.out.println(fryPan2);
        System.out.println(fryPan3);

        System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");

        Blender18 blender1 = new Blender18("Philips", "Stainless Steel", 600, "Alice");
        Blender18 blender2 = new Blender18("Philips", "Stainless Steel", 600, "Alice");
        Blender18 blender3 = new Blender18("Bosch", "Titanium", 800, "Bob");

        boolean match17 = blender1.equals(blender2);
        boolean notmatch17 = blender3.equals(blender2);

        System.out.println("Blender matched " + match17);
        System.out.println("Blender not matched " + notmatch17);

        System.out.println(blender1);
        System.out.println(blender2);
        System.out.println(blender3);

        System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");

        Sea19 sea1 = new Sea19("Ocean", "Pacific", 1000, "Dr. Smith");
        Sea19 sea2 = new Sea19("Ocean", "Pacific", 1000, "Dr. Smith");
        Sea19 sea3 = new Sea19("Sea", "Mediterranean", 500, "Dr. John");

        boolean match18= sea1.equals(sea2);
        boolean notmatch18 = sea3.equals(sea2);

        System.out.println("sea matched " + match18);
        System.out.println("sea not matched " + notmatch18);

        System.out.println(sea1);
        System.out.println(sea2);
        System.out.println(sea3);

        System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
        River20 river1 = new River20("Amazon", "7050 km", "Andes", "South America");
        River20 river2 = new River20("Amazon", "7050 km", "Andes", "South America");
        River20 river3 = new River20("Nile", "6650 km", "Great Lakes", "Africa");

        boolean match19 = river1.equals(river2);
        boolean notmatch19 = river3.equals(river2);

        System.out.println("river matched " + match19);
        System.out.println("river not matched " + notmatch19);

        System.out.println(river1);
        System.out.println(river2);
        System.out.println(river3);

        System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");


        Pendrive21 pendrive1 = new Pendrive21("SanDisk", "64GB", "USB 3.0", "John");
        Pendrive21 pendrive2 = new Pendrive21("SanDisk", "64GB", "USB 3.0", "John");
        Pendrive21 pendrive3 = new Pendrive21("Kingston", "128GB", "USB 3.1", "Alice");

        boolean match20 = pendrive1.equals(pendrive2);
        boolean notmatch20 = pendrive3.equals(pendrive2);

        System.out.println("pendrive matched " + match20);
        System.out.println("pendrive not matched " + notmatch20);

        System.out.println(pendrive1);
        System.out.println(pendrive2);
        System.out.println(pendrive3);

        System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");

        Motherboard22 motherboard1 = new Motherboard22("ASUS", "Z590", "ATX", "Mark");
        Motherboard22 motherboard2 = new Motherboard22("ASUS", "Z590", "ATX", "Mark");
        Motherboard22 motherboard3 = new Motherboard22("Gigabyte", "B450", "Micro ATX", "John");

        boolean match21 = motherboard1.equals(motherboard2);
        boolean notmatch21 = motherboard3.equals(motherboard2);

        System.out.println("motherboard matched " + match21);
        System.out.println("motherboard not matched " + notmatch21);

        System.out.println(motherboard1);
        System.out.println(motherboard2);
        System.out.println(motherboard3);

        System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
        GraphicsCard23 card1 = new GraphicsCard23("NVIDIA", "RTX 3060", 12, "David");
        GraphicsCard23 card2 = new GraphicsCard23("NVIDIA", "RTX 3060", 12, "David");
        GraphicsCard23 card3 = new GraphicsCard23("AMD", "RX 6800", 16, "Sophia");

        boolean match22 = card1.equals(card2);
        boolean notmatch22 = card3.equals(card2);

        System.out.println("graphics card matched " + match22);
        System.out.println("graphics card not matched " + notmatch22);

        System.out.println(card1);
        System.out.println(card2);
        System.out.println(card3);

        System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
    }

    }






