package Ex_24082024.CollectionFramework.List.ArrayList;

import java.util.ArrayList;
import java.util.List;

public class Lab08 {
    public static void main(String[] args) {
        List l = new ArrayList<Integer>();

        l.add("String");
        l.add(true);
        System.out.println(l);  //Though in right hand side we given Integer -- it accepted other than Integer also
        //As List is the Parent class - which can still accept all the data types


        //But if we will provide the datatype in left -- then in restricts the data type input
        List <Integer> l2 = new ArrayList<>();
       // l2.add("String"); ---------Not Allowed
    }
}
