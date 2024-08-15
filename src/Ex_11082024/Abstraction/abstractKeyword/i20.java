package Ex_11082024.Abstraction.abstractKeyword;

public class i20 extends Engine{ //same functions but functionality will be different
    @Override
    void start() {
        System.out.println("Start the i20");
    }

    @Override
    void stop() {
        System.out.println("Stop i20");
    }

    @Override
    void partGearBox() {

    }

    @Override
    void openCar() {
        System.out.println("Open the i20");
    }
}
