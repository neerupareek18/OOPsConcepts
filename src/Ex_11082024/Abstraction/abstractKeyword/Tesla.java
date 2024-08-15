package Ex_11082024.Abstraction.abstractKeyword;

public class Tesla extends Engine{
    void drive(){
        openCar();
        start();
        partGearBox();
        stop();
    }

    @Override
    void start() {

    }

    @Override
    void stop() {

    }

    @Override
    void partGearBox() {

    }

    @Override
    void openCar() {
        System.out.println("Open Tesla");
    }
}
