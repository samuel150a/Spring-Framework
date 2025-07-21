package com.xworkz.register;

import org.springframework.context.annotation.Bean;

import java.util.*;

public class CollectionRegister {
    public CollectionRegister() {
        System.out.println("running in the CollectionRegister");
    }

    @Bean
    public ArrayList<String> firstArrayList()
    {
        System.out.println("firstArrayList method");
        return new ArrayList<>(Arrays.asList("A","B","C",""));
    }

    @Bean
    public ArrayList<String> secondArrayList()
    {
        System.out.println("secondArrayList method");
        return new ArrayList<>(Arrays.asList("D","E","F"));
    }

    @Bean
    public ArrayList<String> thirdArrayList()
    {
        System.out.println("Running in the thirdArrayList ");
        return new ArrayList<>(Arrays.asList("hai","hello","namsate"));
    }
    @Bean
    public ArrayList<String> fouthArrayList()
    {
        System.out.println("Running in the fouthArrayList ");
        return new ArrayList<>(Arrays.asList("hey","how r u","?"));
    }

    @Bean
    public ArrayList<String> fifthArrayList()
    {
        System.out.println("Running in the fifthArrayList ");
        return new ArrayList<>(Arrays.asList("good","very good","excellent"));
    }

    @Bean
    public LinkedList<Integer> firstLinkedList()
    {
        System.out.println("running in the firstLinkedList");
        return new LinkedList<>(Arrays.asList(12,15,16,12));
    }

    @Bean
    public LinkedList<Integer> secondLinkedList()
    {
        System.out.println("running in the secondLinkedList");
        return new LinkedList<>(Arrays.asList(12,8,9,9));
    }

    @Bean
    public LinkedList<Integer> thirdLinkedList()
    {
        System.out.println("running in the thirdLinkedList");
        return new LinkedList<>(Arrays.asList(1,9,9));
    }

    @Bean
    public LinkedList<Integer> fourthLinkedList()
    {
        System.out.println("running in the fourthLinkedList");
        return new LinkedList<>(Arrays.asList(2,58,8,9));
    }

    @Bean
    public LinkedList<Integer> fifthLinkedList()
    {
        System.out.println("running in the fifthLinkedList");
        return new LinkedList<>(Arrays.asList(1,9,9,6));
    }
    @Bean
    public LinkedHashSet<String> firstLinkedHashSet()
    {
        System.out.println("running in the firstLinkedHashSet");
        return new LinkedHashSet<>(Arrays.asList("confident"));
    }
    @Bean
    public LinkedHashSet<String> secondLinkedHashSet()
    {
        System.out.println("running in the firstLinkedHashSet");
        return new LinkedHashSet<>(Arrays.asList("confident"));
    }

    @Bean
    public LinkedHashSet<String> thirdLinkedHashSet()
    {
        System.out.println("running in the thirdLinkedHashSet");
        return new LinkedHashSet<>(Arrays.asList("Courage"));
    }

    @Bean
    public LinkedHashSet<String> fourthLinkedHashSet()
    {
        System.out.println("running in the fourthLinkedHashSet");
        return new LinkedHashSet<>(Arrays.asList("love"));
    }

    @Bean
    public LinkedHashSet<String> fifthLinkedHashSet()
    {
        System.out.println("running in the fifthLinkedHashSet");
        return new LinkedHashSet<>(Arrays.asList("Power"));
    }
    @Bean
    public HashSet<String> firstHashSet()
    {
        System.out.println("running in the firstHashSet");
        return new HashSet<>(Arrays.asList("Power"));
    }
    @Bean
    public HashSet<String> secondHashSet()
    {
        System.out.println("running in the secondHashSet");
        return new HashSet<>(Arrays.asList("Power"));
    }
    @Bean
    public HashSet<String> thirdHashSet()
    {
        System.out.println("running in the thirdHashSet");
        return new HashSet<>(Arrays.asList("Power"));
    }
    @Bean
    public HashSet<String> fourthHashSet()
    {
        System.out.println("running in the fourthHashSet");
        return new HashSet<>(Arrays.asList("Power"));
    }
    @Bean
    public HashSet<String> fifthHashSet()
    {
        System.out.println("running in the fifthHashSet");
        return new HashSet<>(Arrays.asList("Power"));
    }
    @Bean
    public TreeSet<String> firstTreeSet()
    {
        System.out.println("running in the firstTreeSet ");
        return new TreeSet<>(Arrays.asList("SelfRespect"));
    }

    @Bean
    public TreeSet<String> secondTreeSet()
    {
        System.out.println("running in the secondTreeSet ");
        return new TreeSet<>(Arrays.asList("selflove"));
    }
    @Bean
    public TreeSet<String> thirdTreeSet()
    {
        System.out.println("running in the thirdTreeSet ");
        return new TreeSet<>(Arrays.asList("money"));
    }
    @Bean
    public TreeSet<String> fourthTreeSet()
    {
        System.out.println("running in the fourthTreeSet ");
        return new TreeSet<>(Arrays.asList("humility"));
    }
    @Bean
    public TreeSet<String> fifthTreeSet()
    {
        System.out.println("running in the fifthTreeSet ");
        return new TreeSet<>(Arrays.asList("sacrifice"));
    }

@Bean
    public HashMap<String,Integer> firstHashMap()
    {
        System.out.println("running in the firstHashMap ");
        HashMap<String,Integer> map =new HashMap<>();
        map.put("f",1);
        return  map;
    }
    @Bean
    public HashMap<String,Integer> secondHashMap()
    {
        System.out.println("running in the secondHashMap ");
        HashMap<String,Integer> map =new HashMap<>();
        map.put("f",2);
        return  map;
    }

    @Bean
    public HashMap<String,Integer> thirdHashMap()
    {
        System.out.println("running in the thirdHashMap ");
        HashMap<String,Integer> map =new HashMap<>();
        map.put("f",3);
        return  map;
    }

    @Bean
    public HashMap<String,Integer> fourthHashMap()
    {
        System.out.println("running in the fourthHashMap ");
        HashMap<String,Integer> map =new HashMap<>();
        map.put("f",4);
        return  map;
    }
    @Bean
    public HashMap<String,Integer> fifthHashMap()
    {
        System.out.println("running in the fifthHashMap ");
        HashMap<String,Integer> map =new HashMap<>();
        map.put("f",5);
        return  map;
    }
    @Bean
    public LinkedHashMap<String,Integer> firstLinkedHashMap()
    {
        System.out.println("running in the firstLinkedHashMap");
        LinkedHashMap<String,Integer> map=new LinkedHashMap<>();
        map.put("biryani",120);
        return map;
    }
    @Bean
    public LinkedHashMap<String,Integer> secondLinkedHashMap()
    {
        System.out.println("running in the secondLinkedHashMap");
        LinkedHashMap<String,Integer> map=new LinkedHashMap<>();
        map.put("paanipuri",20);
        return map;
    }
    @Bean
    public LinkedHashMap<String,Integer> thirdLinkedHashMap()
    {
        System.out.println("running in the thirdLinkedHashMap");
        LinkedHashMap<String,Integer> map=new LinkedHashMap<>();
        map.put("icecream",45);
        return map;
    }
    @Bean
    public LinkedHashMap<String,Integer> fourthLinkedHashMap()
    {
        System.out.println("running in the thirdLinkedHashMap");
        LinkedHashMap<String,Integer> map=new LinkedHashMap<>();
        map.put("icecream",45);
        return map;
    }

    @Bean
    public LinkedHashMap<String,Integer> fifthLinkedHashMap()
    {
        System.out.println("running in the thirdLinkedHashMap");
        LinkedHashMap<String,Integer> map=new LinkedHashMap<>();
        map.put("dairymilk",5);
        return map;
    }
   @Bean
    public TreeMap<String,Integer> firstTreeMap()
    {
        System.out.println("running in the firstTreeMap ");
        TreeMap<String,Integer> map= new TreeMap<>();
        map.put("gold",100);
        return map;
    }
    @Bean
    public TreeMap<String,Integer> secondTreeMap()
    {
        System.out.println("running in the secondTreeMap ");
        TreeMap<String,Integer> map= new TreeMap<>();
        map.put("silver",100);
        return map;
    }

    @Bean
    public TreeMap<String,Integer> thirdTreeMap()
    {
        System.out.println("running in the thirdTreeMap ");
        TreeMap<String,Integer> map= new TreeMap<>();
        map.put("aluminium",100);
        return map;
    }
    @Bean
    public TreeMap<String,Integer> fourthTreeMap()
    {
        System.out.println("running in the fourthTreeMap");
        TreeMap<String,Integer> map= new TreeMap<>();
        map.put("copper",100);
        return map;
    }
    @Bean
    public TreeMap<String,Integer> fifthTreeMap()
    {
        System.out.println("running in the fifthTreeMap");
        TreeMap<String,Integer> map= new TreeMap<>();
        map.put("bronze",100);
        return map;
    }
    @Bean
    public  Properties firstProperties()
    {
        System.out.println("running in the firstProperties");
        Properties prop  = new Properties();
        prop.setProperty("hello","suresh");
        return  prop;
    }
    @Bean
    public  Properties secondProperties()
    {
        System.out.println("running in the secondProperties");
        Properties prop  = new Properties();
        prop.setProperty("hello","ramesh");
        return  prop;
    }
    @Bean
    public  Properties thirdProperties()
    {
        System.out.println("running in the thirdProperties");
        Properties prop  = new Properties();
        prop.setProperty("hello","peter");
        return  prop;
    }
    @Bean
    public  Properties fourthProperties()
    {
        System.out.println("running in the fourthProperties");
        Properties prop  = new Properties();
        prop.setProperty("hello","john");
        return  prop;
    }
    @Bean
    public  Properties fifthProperties()
    {
        System.out.println("running in the fifthProperties");
        Properties prop  = new Properties();
        prop.setProperty("hello","raj");
        return  prop;
    }
    @Bean
    public Hashtable<String,String> firstHashtable()
    {
        System.out.println("running in the firstHashtable");
        Hashtable hs=new Hashtable<>();
        hs.put("India","Delhi");
        return hs;
    }
    @Bean
    public Hashtable<String,String> secondHashtable()
    {
        System.out.println("running in the secondHashtable");
        Hashtable hs=new Hashtable<>();
        hs.put("Canada","Ottawa");
        return hs;
    }
    @Bean
    public Hashtable<String,String> thirdHashtable()
    {
        System.out.println("running in the thirdHashtable");
        Hashtable hs=new Hashtable<>();
        hs.put("America","usa");
        return hs;
    }

    @Bean
    public Hashtable<String,String> fourthHashtable()
    {
        System.out.println("running in the fourthHashtable");
        Hashtable hs=new Hashtable<>();
        hs.put("nepal","kathmandu");
        return hs;
    }

    @Bean
    public Hashtable<String,String> fifthHashtable()
    {
        System.out.println("running in the fifthHashtable");
        Hashtable hs=new Hashtable<>();
        hs.put("Japan","Tokyo");
        return hs;
    }

public String[] nameArray1()
{
    System.out.println("running in the nameArray1 ");
    return new String[]{"sam","amos"};
}
    public String[] nameArray2()
    {
        System.out.println("running in the nameArray2 ");
        return new String[]{"vivek","sagar"};
    }
    public String[] nameArray3()
    {
        System.out.println("running in the nameArray3 ");
        return new String[]{"santhosh","pavan"};
    }
    public String[] nameArray4()
    {
        System.out.println("running in the nameArray4 ");
        return new String[]{"raj","sushat"};
    }
    public String[] nameArray5()
    {
        System.out.println("running in the nameArray5 ");
        return new String[]{"ravi","kavan"};
    }






}
