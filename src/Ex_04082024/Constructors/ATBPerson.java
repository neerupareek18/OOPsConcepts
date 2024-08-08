package Ex_04082024.Constructors;

import java.util.concurrent.ArrayBlockingQueue;

public class ATBPerson {
    String name;
    int age;

    ATBPerson(){
        System.out.println("I am the DC");
    }

    ATBPerson(String name){
       // this.name=name;
        System.out.println(name);
        System.out.println(this.name);//null till here
        //ATBPerson.name = name;
        //When you use `ATBPerson.name`, the compiler interprets it as an attempt to access a static variable named `name` in the `ATBPerson` class.
        // Since `name` is not declared as static, this results in the error: "non-static variable name cannot be referenced from a static context"

        this.name = name;
        System.out.println(this.name);
    }

    ATBPerson(String name, int age){

    }
}
