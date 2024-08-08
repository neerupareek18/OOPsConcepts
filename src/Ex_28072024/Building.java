package Ex_28072024;

public class Building {
    String name;
    String color;
    int height;
    String address;

    void uselift(){
        System.out.println("You can use the lift");
    }

    void activities(){
        System.out.println("You can play here");
    }

    //Runner method, we can have it in sepearet class or in the same class
    public static void main(String[] args) {
        Building b1 = new Building();
        b1.name = "DLF";
        b1.uselift();
    }
}
