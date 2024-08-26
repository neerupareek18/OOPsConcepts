package Ex_24082024.CollectionFramework.List.LinkedList;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Lab01 {
    public static void main(String[] args) {
        //Removing an adding a node is very easy as shifting is not there as in Arrays
        //Finding an element is very difficult as traverse the node
        //Memory usage is more as there is the detail of previous and next node other than data
        List l = new LinkedList<>();
        l.add(10);
        l.add(60);
        l.add(90);

        Collections.reverse(l);
        System.out.println(l);

        Collections.sort(l);
        System.out.println(l);

        //Linked List and ArrayList seems same in console but the way the data is stored is different
    }
}
