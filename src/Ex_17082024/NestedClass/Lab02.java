package Ex_17082024.NestedClass;


public class Lab02{
    public static void main(String[] args) {
        Car c = new Car("Lambo");
        c.driver();
        Car.GearBox cgb = c.new GearBox();
        Car.GearBox.NutBolts gbn = cgb.new NutBolts(); //User can't directly access the inner class, they need to write this syntax for this
        //Hence, this is secure to create inner class
    }
}

class Car{
    String make;
    public Car(String make){
        this.make=make;
    }

    public void driver(){
        System.out.println("You can drive a car");
    }
    class GearBox{
        void m2(){
            System.out.println("m2");
        }
        class NutBolts{

        }
    }
}

