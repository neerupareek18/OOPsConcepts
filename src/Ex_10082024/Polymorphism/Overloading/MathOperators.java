package Ex_10082024.Polymorphism.Overloading;

public class MathOperators {
    //poly - many, morph - forms
    //Compile time, Static, Method Overloading
    //Run time, Dynamic, Overriding

    private int add(int a, int b){//we can't send the double arguments, we need to create a new function for this
        return 20;
    }
    public int add(long a, long b){
        return 10;
    }

    //Change of arguments position
    //Change of data types in arguments
    //Add/remove arguments

    //We can also have constructor overloading

    int add(double a, double b){
        return (int)(a+b);
    }

    int add(String a, String b){
        return 10;
    }

    int add(String a, int b){
        return b;
    }

    int add(char c){
        return c;
    }

//    double add(int b, int a){ -- Can't do this as the arguments are same
//
//    }

    // Change only in the return type will not be allowed for Overloading

}
