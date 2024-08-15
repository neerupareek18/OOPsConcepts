package Ex_11082024.Abstraction.abstractKeyword;

public abstract class GearBox extends Keys {
    public static int a = 10;

        static{
        System.out.println("I am static");
    }
    abstract void partGearBox();
}
    //Abstract class does not have object creation
    //They can have constrcutor but there is no point as they can't be called

//methods cannot be private, final, static, synchronized in abstract class