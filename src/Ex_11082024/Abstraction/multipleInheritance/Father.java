package Ex_11082024.Abstraction.multipleInheritance;

public interface Father {
    void money();
    void home();

    default void bike(){
        System.out.println("I have a bike");
    } //default keyword can only be there in interface, not in classes, in classes no keyword means default

    static void kite(){
        System.out.println("I have a kite");
    }
}
