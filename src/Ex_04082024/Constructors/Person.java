package Ex_04082024.Constructors;

public class Person {
    String name;
    int age;

    Person(){ //-- DC: Special method which will be called automatically when Object is created -- by default
        //There is no return type
        //Will be of same name as class
        this.name = "Neeru";
        System.out.println("I will be called as soon as Object is created");
    }

    void talk(){
        System.out.println("I am talking");
    }
}
