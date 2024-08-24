package Ex_11082024.Abstraction.usingInterface;

public interface Vehicle {
    void start();
    void stop();
//static{
//    System.out.println("Static Block");
//} -- We cannot define static block in interface, it can be in concreate and abstract class

    default void d(){
        System.out.println("Default Method");
    }

    static void d1(){
        System.out.println("Static");
    }

}
