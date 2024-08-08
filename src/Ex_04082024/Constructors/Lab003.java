package Ex_04082024.Constructors;

public class Lab003 {
    public static void main(String[] args) {
        Car c1 = new Car();
        Car c2 = new Car();
        Car c3 ; //In this case, constructor will not be called as object is not created
        new Car(); //This also possible, without reference

        //Purpose of Constructor -- To execute the code which you want to run before running any test
        //Reading the Excel, data from My SQL, etc.
    }
}
