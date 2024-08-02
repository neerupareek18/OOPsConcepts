package LiveClassPrograms_28072024;

import PersonClass_Protected.Person;

public class Runner_Person {
    public static void main(String[] args) {
        //Class_Name Class_reference = Object
        //Object is also an instance of the class

        //Real Person 1
        Person p1 = new Person();
        /*
        Person -- Class is loaded -- Blue print does not take much space
        p1 -- reference
        new -- a memory is created for the object

         */

        p1.name = "Neeru";
        p1.rollno = 15;
        p1.walk();
        System.out.println(p1);

        //Real Person 2
        Person p2 = new Person();
        p2.name = "Kash";
        p2.rollno = 20;
        p1.talk();
        p2.walk();

        //If the Person class is in different package, the import package statement will automatically be there
        //Also, we will get the error for the column names and methods as by deafult they are 'protected'
        // They can be used in the same package, not outside it, so we need to mention'public' before these

        //Ideally, we should keep the Class and Runner Class in the same folder

        Person p3 = null;
        System.out.println(p3); //No object is created, reference will point to null
        //as soon as 'Person' is written, the default values will be loaded for the instance variables

        //Total 2 objects are created from the above

        Person p4 = p2;
        //No new object, just p4 will point to the object referenced by p2
        //Still 2 objects are there
        System.out.println(p4==p2);

        Building b1 = new Building();
        b1.name = "Prestige";
    }
}
