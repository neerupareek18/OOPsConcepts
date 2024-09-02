package Ex_24082024.CollectionFramework.Map;

import java.util.*;

public class Lab01 {
    public static void main(String[] args) {
        //Map -- Interface -- Key-Value
        //Uique Keys are there
        //Only one null key should be there
        //HashMap, LinkedHashMap, TreeMap

        Map<String, Integer> m1 = new HashMap();
        Map m2 = new LinkedHashMap();
        Map m3 = new TreeMap();

        m1.put("Neeru", 2);
        m1.put("Harsh", 1);
        System.out.println(m1.size());
        System.out.println(m1.isEmpty());
        System.out.println(m1.keySet());
        System.out.println(m1.containsKey(1));
        System.out.println(m1.get("Neeru"));
        System.out.println(m1.get(2));
        System.out.println(m1.containsValue(2));
        System.out.println(m1.values());

        m2.put("Neeru", 2);
        m2.put("Harsh", 1);

        m3.put("Neeru", 2);
        m3.put("Harsh", 1);

        System.out.println(m1);
        System.out.println(m2);
        System.out.println(m3);

        //Iteration of Map
        for(Map.Entry<String, Integer> i: m1.entrySet()){
            System.out.println(i.getKey());
            System.out.println(i.getValue());
        }

    }
}

