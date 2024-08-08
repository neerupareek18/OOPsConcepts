package Ex_04082024;

public class Lab004 {

    int age = 42; //instance variable
    //In Java, there is no concept of global variable
    void f1(){
        int e = 10;
        System.out.println(age);
    }

    void f2(){
        int age = 10; //we can create local variable with same name as instance variable, JVM will give the priority to local variable
        //System.out.println(e); -- can't be used here, as this is the local to f1
        System.out.println(age);
    }

    public static void main(String[] args) {
        Lab004 l = new Lab004();
        l.f1();
        l.f2();
    }

    //Ideally, blue-print should not have the main method
}
