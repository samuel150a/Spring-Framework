package com.xworkz.task1;

import java.util.*;

public class SweetRunner
{
    public static void main(String[] args) {
        SweetDto sweetDto1 = new SweetDto("Peda", 135, new String[]{"milk", "sugar", "ghee", "pista", "badam"}, 8, 2);
        SweetDto sweetDto2 = new SweetDto("Ladoo", 138, new String[]{"coconut", "jaggery", "cardamom", "milk powder", "cashew"}, 9, 3);
        SweetDto sweetDto3 = new SweetDto("Barfi", 141, new String[]{"flour", "honey", "rose water", "butter", "almond"}, 7, 1);
        SweetDto sweetDto4 = new SweetDto("Kaju Katli", 144, new String[]{"khoya", "saffron", "dry fruits", "cream", "camphor"}, 6, 4);
        SweetDto sweetDto5 = new SweetDto("Halwa", 147, new String[]{"milkmaid", "vanilla", "clove", "nutmeg", "dates"}, 10, 5);
        SweetDto sweetDto6 = new SweetDto("Chocolate Modak", 150, new String[]{"chocolate", "cocoa", "condensed milk", "walnut", "molasses"}, 8, 2);
        SweetDto sweetDto7 = new SweetDto("Ragi Laddu", 153, new String[]{"ragi", "jowar", "palm sugar", "dry ginger", "fig"}, 9, 3);
        SweetDto sweetDto8 = new SweetDto("Kesari Bath", 156, new String[]{"semolina", "melon seeds", "kesar", "neem flower", "apricot"}, 6, 1);
        SweetDto sweetDto9 = new SweetDto("Malpua", 159, new String[]{"maida", "baking soda", "curd", "oil", "custard"}, 7, 4);
        SweetDto sweetDto10 = new SweetDto("Sandesh", 162, new String[]{"paneer", "lemon juice", "cornflour", "syrup", "rose essence"}, 10, 5);

        SweetDto sweetDto11 = new SweetDto("Besan Ladoo", 165, new String[]{"gram flour", "turmeric", "pepper", "white sugar", "vanaspati"}, 6, 2);
        SweetDto sweetDto12 = new SweetDto("Appam", 168, new String[]{"rice flour", "banana", "elaichi", "sesame", "glucose"}, 9, 3);
        SweetDto sweetDto13 = new SweetDto("Mysore Pak", 171, new String[]{"bengal gram", "buttermilk", "makhana", "jamun", "ash gourd"}, 8, 1);
        SweetDto sweetDto14 = new SweetDto("Doodh Peda", 174, new String[]{"soy flour", "buttermilk", "salt", "anise", "peach"}, 7, 4);
        SweetDto sweetDto15 = new SweetDto("Wheat Halwa", 177, new String[]{"wheat flour", "desi ghee", "fennel", "licorice", "strawberry"}, 10, 5);
        SweetDto sweetDto16 = new SweetDto("Fruit Barfi", 180, new String[]{"guava", "blueberry", "orange peel", "cumin", "mango"}, 9, 2);
        SweetDto sweetDto17 = new SweetDto("Jelly Sweet", 183, new String[]{"corn flour", "gelatin", "fruit essence", "food color", "cranberry"}, 8, 3);
        SweetDto sweetDto18 = new SweetDto("Arrowroot Halwa", 186, new String[]{"arrowroot", "mace", "lotus seeds", "pear", "agar"}, 6, 1);
        SweetDto sweetDto19 = new SweetDto("Barley Kheer", 189, new String[]{"barley", "sugarcane syrup", "peanut", "gooseberry", "jasmine"}, 7, 4);
        SweetDto sweetDto20 = new SweetDto("Sabudana Sweet", 192, new String[]{"sabudana", "kaju katli mix", "grapes", "tulsi", "basil"}, 10, 5);

        SweetDto sweetDto21 = new SweetDto("Poha Laddu", 195, new String[]{"poha", "gingelly oil", "musk melon", "chai masala", "pineapple"}, 9, 2);
        SweetDto sweetDto22 = new SweetDto("Bajra Mithai", 198, new String[]{"bajra", "maple syrup", "beetroot", "poppy seeds", "cashew cream"}, 8, 3);
        SweetDto sweetDto23 = new SweetDto("Chana Sweet", 201, new String[]{"chana dal", "clotted cream", "ginger oil", "turmeric leaf", "curry leaf"}, 6, 1);
        SweetDto sweetDto24 = new SweetDto("Green Gram Delight", 204, new String[]{"green gram", "chikoo", "jam", "vanilla bean", "cinnamon"}, 7, 4);
        SweetDto sweetDto25 = new SweetDto("Oats Laddu", 207, new String[]{"oats", "almond milk", "rose petals", "dry fig", "goji berries"}, 10, 5);
        SweetDto sweetDto26 = new SweetDto("Groundnut Chikki", 210, new String[]{"groundnut", "til", "frosting", "custard apple", "blackberry"}, 9, 2);
        SweetDto sweetDto27 = new SweetDto("Lotus Jam Sweet", 213, new String[]{"lotus stem", "jamun syrup", "kokum", "raspberry", "rhubarb"}, 8, 3);
        SweetDto sweetDto28 = new SweetDto("Sweet Potato Roll", 216, new String[]{"sweet potato", "apple puree", "black salt", "guar gum", "pumpkin"}, 6, 1);
        SweetDto sweetDto29 = new SweetDto("Sesame Delight", 219, new String[]{"black sesame", "mulberry", "dry rose", "sapota", "corn syrup"}, 7, 4);
        SweetDto sweetDto30 = new SweetDto("Amla Mithai", 222, new String[]{"nutri nuggets", "amla", "orange zest", "lemongrass", "jaggery dust"}, 10, 5);


        Set<SweetDto> sweet=new TreeSet<>();
        sweet.add(sweetDto1);
        sweet.add(sweetDto2);
        sweet.add(sweetDto3);
        sweet.add(sweetDto4);
        sweet.add(sweetDto5);
        sweet.add(sweetDto6);
        sweet.add(sweetDto7);
        sweet.add(sweetDto8);
        sweet.add(sweetDto9);
        sweet.add(sweetDto10);
        sweet.add(sweetDto11);
        sweet.add(sweetDto12);
        sweet.add(sweetDto13);
        sweet.add(sweetDto14);
        sweet.add(sweetDto15);
        sweet.add(sweetDto16);
        sweet.add(sweetDto17);
        sweet.add(sweetDto18);
        sweet.add(sweetDto19);
        sweet.add(sweetDto20);
        sweet.add(sweetDto21);
        sweet.add(sweetDto22);
        sweet.add(sweetDto23);
        sweet.add(sweetDto24);
        sweet.add(sweetDto25);
        sweet.add(sweetDto26);
        sweet.add(sweetDto27);
        sweet.add(sweetDto28);
        sweet.add(sweetDto29);
        sweet.add(sweetDto30);



        sweet.stream().sorted((s1,s2)->Integer.compare(s2.getPrice(),s1.getPrice())).forEach(System.out::println);
        System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$4");
//        sweet.stream().sorted((s1,s2)->Integer.compare(s2.getPrice(),s1.getPrice()))&&.forEach(System.out::println);
 List<SweetDto> conversion=new LinkedList<>(sweet);
 conversion.forEach(System.out::println);

    }
}
