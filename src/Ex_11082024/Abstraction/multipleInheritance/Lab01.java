package Ex_11082024.Abstraction.multipleInheritance;

public class Lab01 {
    public static void main(String[] args) {
        Father f = new Son();
        f.money();
        f.home();
        f.bike();
        Father.kite();
    }
}

//Abstract -- Don't support multiple inheritance, Can have public, protected, private data members, Can have non-static and non-final members too
//Constructors can be defined

//-------------------------------------------------------------------------------------------------------------

//Interface -- Supports multiple inheritance, All members are public, All data members are static and final,
// Constructor can't be defined
