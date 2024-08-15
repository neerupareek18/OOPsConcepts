package Ex_11082024.Abstraction.abstractKeyword;

public abstract class Engine extends GearBox{
    //abstract means - incomplete
public int a =10;
private int b = 20;
protected int c =30;
    abstract void start();
    abstract void stop();

    void display(){
        System.out.println(b);
    }
}
