package Ex_04082024.Constructors;

public class Car {
    protected Car() { //Constructors can also be private, protected, public
        System.out.println("I am a car");
        //Purpose
        System.out.println("Reading the data from My SQL");
        System.out.println("Reading the data from Excel");

        //There can be only one default constructor

    }
}
