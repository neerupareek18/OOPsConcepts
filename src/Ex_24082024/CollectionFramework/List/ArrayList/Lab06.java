package Ex_24082024.CollectionFramework.List.ArrayList;

import java.util.ArrayList;

public class Lab06 {
    public static void main(String[] args) {
        ArrayList al = new ArrayList();
        al.add("Neeru");
        al.add(8457932859320482l);
        al.add(true);

        ArrayList al2 = new ArrayList();
        al2.add("Neeru");
        al2.add(true);
//
//        al.removeAll(al2);
//        System.out.println(al);

        System.out.println(al.containsAll(al2));
        al.retainAll(al2); //returns the common values in both the collections

        System.out.println(al);

        al.set(1,"Manas"); //Can't give the index which is not present
        System.out.println(al);
    }
}
