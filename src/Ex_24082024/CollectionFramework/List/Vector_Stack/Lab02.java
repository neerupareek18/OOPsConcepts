package Ex_24082024.CollectionFramework.List.Vector_Stack;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.Stack;

public class Lab02 {
    public static void main(String[] args) {
        //Stack - Legacy Class
        //LIFO, FILO
        List l = new Stack<>();
        l.add(10);
        l.add("Neeru");
        l.add(80);

        System.out.println(l);
        //We can't use push, pop, peek methods as the List does not have these methpds
        //We need to create the reference of Stack only to use it

        Stack s = new Stack();
        s.push(10);
        s.push("Push");
        s.push(true);
        System.out.println(s);

        s.pop();
        System.out.println(s);

        System.out.println(s.peek());

        Iterator i = s.iterator();
        while(i.hasNext()){
            System.out.println(i.next());
        }

        Enumeration e = s.elements();
        while(e.hasMoreElements()){
            System.out.println(e.nextElement());
        }
    }
}
