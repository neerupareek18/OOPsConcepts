package Ex_11082024.Abstraction.multipleInheritance;

public class Son implements Father, Mother{

    @Override
    public void money() {
        System.out.println("This is only one function");
    }

    @Override
    public void home() {
        System.out.println("This is home");

    }

    @Override
    public void bike() {
        Father.super.bike(); //super.bike() will not work
    }
}
