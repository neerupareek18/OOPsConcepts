package Ex_11082024.Abstraction.abstractKeyword;
//Hiding within the class - Encapsulation -- using private
//Hiding the core functionality -- Abstraction - abstract class, interface

//abstract -- it can be class or method

//Car will have several features -- Engine, GearBox, Keys
//Tesla is A kind of Car

//For the user -- will have only Tesla and drive

public class Car extends Engine{ //We need to define Car as abstarct while extending from abstract from
    //After we generate the Overriden of all the methods, we can remove abstarct class

    @Override
    void openCar() {
        System.out.println("Open Car");
    }

    @Override
    void partGearBox() {
        System.out.println("Gear Box parts");
    }

    @Override
    void stop() {
        System.out.println("Stop the car");
    }

    @Override
    void start() {
        System.out.println("Start the car");
    }
}
