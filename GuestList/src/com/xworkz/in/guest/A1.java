package com.xworkz.in.guest;

import com.sun.org.apache.xerces.internal.impl.xpath.XPath;

import java.util.*;

public class A1 {
    public static void main(String[] args) {
        Collection<Integer> number = new ArrayList<>();
        number.add(1);
        number.add(2);
        number.add(3);
        number.add(4);
        number.add(5);
        number.add(6);
        number.add(7);
        number.add(8);
        number.add(9);
        number.add(10);
        System.out.println(number);
        System.out.println("************************************************************");


        LinkedList<String> city = new LinkedList<>();
        city.add("Banglore");
        city.add("Delhi");
        city.add("Hydrabad");
        city.add("Chennai");
        city.add("Mumbai");
        for (String s : city) {
            System.out.println(s);
        }
        System.out.println("************************************************************");

        ArrayList<Integer> greater = new ArrayList<>();
        greater.add(10);
        greater.add(20);
        greater.add(30);
        greater.add(40);
        greater.add(50);
        greater.add(60);
        greater.add(70);
        greater.add(80);
        greater.add(90);
        greater.add(100);
        System.out.println(greater);
        System.out.println("After removing the Greater than 50 values");


        for (int i = greater.size() - 1; i >= 0; i--) {
            if (greater.get(i) > 50) {
                greater.remove(i);
            }
        }
        System.out.println(greater);

        System.out.println("************************************************************");

        HashSet<String> fruit = new HashSet<>();
        fruit.add("Apple");
        fruit.add("orange");
        fruit.add("cherry");
        fruit.add("goa");
        fruit.add("bannana");

        System.out.println(fruit);
        fruit.add("Apple");
        System.out.println("After adding Apple Again");
        System.out.println(fruit);
        System.out.println("************************************************************");

        Collection<Object> chk = new ArrayList<>();
        chk.add(23);
        chk.add(21);
        chk.add(5);
        System.out.println(chk);
        for (Object obj : chk)
            if (obj instanceof String) {
                System.out.println("It consists String");

            } else {
                System.out.println("no String");
            }
        System.out.println("************************************************************");
        LinkedHashSet<Integer> check = new LinkedHashSet<>();
        check.add(5);
        check.add(10);
        check.add(15);
        check.add(10);
        check.add(20);
        System.out.println(check);
        System.out.println("***************************07.*********************************");

        List<String> alpha = new ArrayList<>();
        alpha.add("E");
        alpha.add("D");
        alpha.add("C");
        alpha.add("B");
        alpha.add("A");
        System.out.println(alpha);
        Collections.sort(alpha);
        System.out.println(alpha);
        System.out.println("****************************08.*****************************************");

        HashSet<String> isEmpty = new HashSet<>();
        isEmpty.add("r");
        isEmpty.add("l");
        isEmpty.add("o");
        System.out.println(isEmpty);
        Boolean re = isEmpty.isEmpty();
        System.out.println("the Set is empty" + re);
        System.out.println("****************************09.*****************************************");

        TreeSet<String> country = new TreeSet<>();
        country.add("India");
        country.add("canada");
        country.add("Australia");
        country.add("Japan");
        System.out.println(country);
        System.out.println("****************************10.*****************************************");

        ArrayList<Integer> tsk = new ArrayList<>();
        tsk.add(1);
        tsk.add(2);
        tsk.add(3);
        tsk.add(4);

        tsk.add(2, 99);
        System.out.println(tsk);
        System.out.println("****************************11.*****************************************");
        List<String> siz = new ArrayList<>();
        siz.add("welcome");
        siz.add("to");
        siz.add("To my  ");
        siz.add("IT Company");
        int size = siz.size();
        System.out.println(size);
        System.out.println("****************************12.*****************************************");
        HashSet<Integer> rem = new HashSet<>();
        rem.add(2);
        rem.add(4);
        rem.add(6);
        rem.add(8);
        rem.remove(6);
        System.out.println(rem);
        System.out.println("****************************13.*****************************************");
        TreeSet<Integer> num = new TreeSet<>(Collections.reverseOrder());
        num.add(610);
        num.add(94);
        num.add(889);
        num.add(7841);
        System.out.println(num);
        System.out.println("****************************14.*****************************************");
        LinkedList<String> rep = new LinkedList<>();
        rep.add("a");
        rep.add("b");
        rep.add("c");
        rep.add("d");
        rep.set(1, "iji");
        System.out.println(rep);
        System.out.println("****************************15.*****************************************");
        ArrayList<String> rmve = new ArrayList<>();
        rmve.add("a");
        rmve.add("b");
        rmve.add("c");
        rmve.add("d");
        System.out.println(rmve);
        rmve.removeAll(rmve);

        System.out.println(rmve);
        System.out.println("****************************16.*****************************************");
        HashSet<String> ckit = new HashSet<>();
        ckit.add("apple");
        ckit.add("Banana");
        Boolean resl = ckit.contains("Banana");
        System.out.println("Banana is present in the list  " + resl);


        System.out.println("****************************17.*****************************************");
        ArrayList<String> cpy = new ArrayList<>();
        cpy.add("a");
        cpy.add("b");
        cpy.add("c");
        cpy.add("d");
        HashSet<String> cpy1 = new HashSet<>(cpy);
        System.out.println(cpy);
        System.out.println(cpy1);
        System.out.println("****************************18.*****************************************");
        TreeSet<Integer> lst = new TreeSet<>();
        lst.add(1);
        lst.add(2);
        lst.add(3);
        lst.add(4);
        System.out.println(lst);
        Integer Last = lst.last();
        System.out.println("Last element is " + Last);
        Integer First = lst.first();
        System.out.println("First element is " + First);
        System.out.println("****************************19.*****************************************");
        List<String> idx = new ArrayList<>();
        idx.add("a");
        idx.add("b");
        idx.add("c");
        idx.add("d");
        for (int i = 0; i < idx.size(); i++) {


            System.out.println("index of " + i + " we have " + idx.get(i));


        }
        System.out.println("****************************20.*****************************************");
        LinkedHashSet<String> inte = new LinkedHashSet<>();
        inte.add("a");
        inte.add("b");
        inte.add("c");
        inte.add("d");
        Iterator<String> iterator = inte.iterator();
        System.out.println("By using iterator");
        int index = 0;
        while (iterator.hasNext()) {
            String value = iterator.next();
            System.out.println("index of " + index + " we have " + value);
            index++;

        }
        System.out.println("****************************21.*****************************************");
        ArrayList<Integer> nu=new ArrayList<>();
        nu.add(1);
        nu.add(2);
        nu.add(3);
        nu.add(4);
int ma=Collections.max(nu);
        System.out.println("max num is "+ma);
        System.out.println("****************************22.*****************************************");

        TreeSet<Integer> set = new TreeSet<>();
        set.add(10);
        set.add(20);
        set.add(50);
        set.add(60);
        set.add(90);

        Iterator<Integer> itr = set.iterator();
        while (itr.hasNext()) {
            if(itr.next() < 50) {
                itr.remove();
            }
        }

        System.out.println("After removing  " + set);
        System.out.println("****************************23.*****************************************");
        HashSet<String> set1 = new HashSet<>();
        set1.add("Apple");
        set1.add("Banana");
        set1.add("Cherry");

        List<String> list = new ArrayList<>(set1);

        System.out.println("list: " + list);
        System.out.println("****************************24.*****************************************");


        ArrayList<String> w = new ArrayList<>();
        w.add("A");
        w.add("B");
        w.add("C");
        w.add("D");

        System.out.println("Orig lst: " + w);


        Collections.reverse(w);

        System.out.println("Reve list: " + w);
        System.out.println("****************************25.*****************************************");

LinkedList<String> hl=new LinkedList<>();
hl.add("hello");
        hl.add("how");
        hl.add("r");
        hl.add("u");
        Boolean ck=hl.contains("hello");
        System.out.println("contains hello "+ ck);


    }
}

