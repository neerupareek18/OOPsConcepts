package Ex_24082024.CollectionFramework.List.ArrayList;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Lab04 {
    public static void main(String[] args) {
        //Collections - Frameword
        //Collection -- Interface -- Object can't be created

        Collection c = new ArrayList();
        c.add("1");
        c.remove(1);
        System.out.println(c);
        c.remove("1");
        System.out.println(c);

        //-------------------------------------------

        List l = new ArrayList();
        l.add(1);
        l.add("true");
        System.out.println(l);

        //------------------------------------------------

        ArrayList al = new ArrayList(1); //Initial Capacity can be given
        al.add("ArrayList");
        System.out.println(al);

        al.add(1); //Though we have given the initial size as 1, we are able to still store 2 values because the size automatically increases by the load factor
        System.out.println(al);

        ArrayList al2 = new ArrayList(10);
        al2.add(2);
        al2.addAll(al);
        System.out.println(al2);

        System.out.println(al2.size());
        System.out.println(al2.contains(5));

        String s1 = (String) al2.get(0);
        System.out.println(s1);

        //ArrayList is in continuous memory in heap
        //But when the values reach to size-1 , it increases the size by the load factor (1.5 -- depending on the RAM ROM of the system)

    }
}
