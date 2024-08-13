package Ex_10082024.super_this_keyword;

public class Vehicle {
    //super -- it is used to call the data members, constructor and methods of parent class
Vehicle(){
    System.out.println("Deafult Constructor");
}

Vehicle(String a){
    super(); //Every class by default inherits Object class, that is why this is not showing any error


}

    protected int maxspeed = 200;
    void message(){
        System.out.println("maxSpeed-->"+maxspeed);
    }

}
