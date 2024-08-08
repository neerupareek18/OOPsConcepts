package Ex_04082024.AccessModifiers.Police;

public class Constable extends Cop1{
    void method(){
        System.out.println(super.guns);
        System.out.println(super.name);
        //System.out.println(super.code);
        System.out.println(super.vehicleNo);
    }
}
