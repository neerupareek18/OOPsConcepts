package Ex_10082024.super_this_keyword;

public class Car extends Vehicle{
    protected int maxspeed = 100;


    Car(){
        super(); //Super constructor should be always the first statement
        //This is constructor chaining
        System.out.println("Default of Car");
        super.message();
    }

    void displayspeed(){
        System.out.println(this.maxspeed);
        System.out.println(super.maxspeed);
    }

    void message(){
        System.out.println("This is Car");
        super.message();
    }
}
