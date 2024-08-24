package Ex_24082024.CollectionFramework.List.ArrayList;

import java.util.List;

public class Lab05 {
    public static void main(String[] args) {
        List l = List.of(1, 2, "Fruits", "Veg", true); //if we need to directly provide the values
        //Though we can't create the object but can call the static methods of interface
        //of is the static function

        l.add("Apple"); //this will give the runtime error as add in interface is the incomplete method, no one has completed it
        System.out.println(l);
    }
}
