package Ex_04082024.AccessModifiers.Police;

public class Cop1 {
    int guns;
    public String name;
    private String code;
    protected int vehicleNo;

    private void shoot(){
        System.out.println("Yes, you can shoot!");
    }

    protected void shoot2(){
        System.out.println("Can I shoot?");
        shoot();
    }

    public void shoot_public(){
        System.out.println("No, you can't shoot");
    }
//This won't work -- default is not a keyword
//    deafult void shoot_default(){
//        System.out.println("I am default");
//    }

    //You need to provide nothing for default
    void shoot_default(){
        System.out.println("I am default");
    }

}
