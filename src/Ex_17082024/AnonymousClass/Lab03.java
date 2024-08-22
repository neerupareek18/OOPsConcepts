package Ex_17082024.AnonymousClass;

public class Lab03 {
    public static void main(String[] args) {
        ABC a = new ABC(){ //Anonymous class
            public void m1(){

            }
            public void m2(){ //we need to use public otherwise there will be error

            }
        };

        CBA c = new CBA(){ //Anonymous Class
           void m3(){

           }
        };
    }
}

interface ABC{
    void m1();
    void m2();

}

abstract class CBA {
    abstract void m3();
}

//abstract CBA{
//    abstract void m1();
//
//}
