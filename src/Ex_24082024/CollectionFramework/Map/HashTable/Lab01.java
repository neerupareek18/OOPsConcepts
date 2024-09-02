package Ex_24082024.CollectionFramework.Map.HashTable;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;

public class Lab01 {
    public static void main(String[] args) {
        //HashTable -- Same as Map but
        //-- Doesn't allow null, Synchronised, slow, Legacy Class
        Hashtable <Integer, String>m = new Hashtable();
        m.put(1, "Neeru");
        m.put(2, "Ankita");
//
        for(Map.Entry<Integer, String>i: m.entrySet()){
            System.out.println(i.getValue());
        }

        //Enumeration-------------
        Enumeration<Integer> e = m.keys();
        while(e.hasMoreElements()){
            System.out.println(m.get(e.nextElement()));
        }

    }
}
