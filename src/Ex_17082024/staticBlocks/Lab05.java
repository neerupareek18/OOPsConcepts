package Ex_17082024.staticBlocks;

public class Lab05 {
    public static void main(String[] args) {
        A a = new A();
        A a1 = new A();

        System.out.println(a.age);
        System.out.println(A.discount);
        a.m2();
        A.m1();

        //IIB -- instance intisialisation block
    }
}

class A{
    int age =10; //Instance variable
    static int discount = 10; //Static Variable
    static{
        System.out.println("SBI"); //This is called only once (first time) -- when class is loaded
    }
    {
        System.out.println("ICICI"); //This is called every time the objet is created
    }

    static void m1(){
        System.out.println("m1");
        //System.out.println(age); //non-static variables can't be called in static method
        //m2(); //This is also not possible
    }
    void m2(){
        System.out.println("m2");
        System.out.println(discount); //static variables can be called in non-static methods
    }
}
