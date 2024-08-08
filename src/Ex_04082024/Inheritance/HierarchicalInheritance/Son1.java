package Ex_04082024.Inheritance.HierarchicalInheritance;

public class Son1 extends Father{
    void home(){
        bhk2();
    }
}

//--------------Diamond Problem---------------
//Multiple Inheritance is not possible,
// because it will create the ambiguity if same methods are there in two or more extended classes

//This can be done using interface

