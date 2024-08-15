package Ex_11082024.Abstraction.abstractKeyword;

public class Lab01 {
    public static void main(String[] args) {
        Tesla t = new Tesla();
        t.drive(); //user doesn't know internally using car and its extended functions
        //function is same but functionlity is different
        WagonR w = new WagonR();
        w.drive();

        i20 i = new i20();
        i.openCar();

        //We cannot create the object of abstract classes, we need to override there itself
        //but dynamic dispatch is possible

    }
}
