package Ex_04082024.Inheritance.HasARelationship;

public class Car {
    void StartTheCar(){
        new Engine().strt();
        new Tyres().roll();

        //Has-A Relationship -- Aggregation
        //Laptop --> Keyboard, Mouse, Camera -- Has-A
        //Bank --> Customer
        //Bank --> ICICI -- Is-A
    }

    //Association --> Aggregation --> Composition
    //Aggreagation -- Clases are combined-together, but can exists separately also -- books are in library but books can be seperately exist too
    //Composition -- One class is nothing without the whole, room cannot exists without home
}
