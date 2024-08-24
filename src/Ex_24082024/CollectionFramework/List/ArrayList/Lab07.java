package Ex_24082024.CollectionFramework.List.ArrayList;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

public class Lab07 {
    public static void main(String[] args) {
        ArrayList c = new ArrayList();
        c.add(1);
        c.add(3);
        c.add(5);

        //Traversing
        for(Object o: c){
            System.out.println(o);
        }

        System.out.println("------------------");

        for(int i =0; i<c.size();i++){
            System.out.println(c.get(i)); //Collection refernece does not supports get method
        }
        System.out.println("----------------");

        Iterator i = c.iterator();
        while(i.hasNext()){
            System.out.println(i.next());
        }

       Collections.sort(c);
        System.out.println(c);
    }
}
