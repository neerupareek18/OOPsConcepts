package Ex_24082024.CollectionFramework.List.Vector_Stack;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class Lab01 {
    public static void main(String[] args) {
        //Vector -- Same as ArrayList but legacy Class
        //Synchronised, Thread Safe, Slow

        Vector l1 = new Vector();
        l1.add(1);
        l1.add("Vector");
        l1.add(true);

        Enumeration e = l1.elements();
        while(e.hasMoreElements()){
            System.out.println(e.nextElement());
        }

        System.out.println("-----------------");

        Iterator i = l1.iterator();
        while(i.hasNext()){
            System.out.println(i.next());
        }



    }

    public static class Lab02 {
        public static void main(String[] args) {

        }
    }
}
