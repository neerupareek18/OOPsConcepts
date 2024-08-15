package Ex_11082024.Abstraction.abstractKeyword;

public class WagonR extends Car{
    void drive(){
        openCar();
        start();
        stop();

        //Since both WagonR and Tesla extends from Car, we have the same functionality for both,
        // if we need to change these two, so instead of Car, extend from Engine and Override the methods

    }
}
