package Ex_24082024.CollectionFramework.List.ArrayList;

import java.util.List;
import java.util.Stack;

public class Lab02 {
    public static void main(String[] args) {
        //Stack -- Legacy, 95% notused in autoamtion -- LIFO, FILO
        Stack l = new Stack();
        //Stack inteface
        l.add(10);
        l.remove(0);
        l.push(10);
        l.push(11);
        System.out.println(l.peek());
        l.pop();
        System.out.println(l);

        //If List is reference, then not be able to use push, peek, pop methods, they are of stack only


    }
}
