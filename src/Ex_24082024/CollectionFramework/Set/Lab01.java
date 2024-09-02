package Ex_24082024.CollectionFramework.Set;

import java.util.*;

public class Lab01 {
    public static void main(String[] args) {
        //List -- allows Duplicates
        //Set -- Doesn't allow Duplciates
        Set s1 = new HashSet();
        //Random Order -- Hashing mechanism to store the elements, No Order
        s1.add("Apple");
        s1.add("Orange");
        s1.add("WaterMelon");
        s1.add("Orange");
        s1.add(null);
        System.out.println(s1);
        System.out.println(s1.size());

        Set s2 = new LinkedHashSet();
        //Order in which the user has entered the values
        s2.add("Apple");
        s2.add("WaterMelon");
        s2.add("Orange");
        s2.add("Orange");
        s2.add(null);
        s2.add(10);
        System.out.println(s2);

        //Collections.sort() is sued for Lists not for set

//        List l = new ArrayList(s2);
//        Collections.sort(l);
//        System.out.println(l);

        //Runtime error due to -- s2.add(null); and s2.add(10);

        Set s3 = new TreeSet();
        //Natural Order
        s3.add("WaterMelon");
        s3.add("Orange");
        s3.add("Apple");
        s3.add("Orange");
        //s3.add(10); // This will throw the run time error as the sorting can't be done in different data types
        //s3.add(null); //Sorting with null is not possible hence it will show run time error
        System.out.println(s3);

        //Iterator and For each loop can be used for printing the elements

        //For loop is not supported in set, get method is not there

    }
}
