package Ex_17082024.NestedClass;

import org.w3c.dom.ls.LSOutput;
class Lab01{

}

class OC{
    Integer a = 10;

    class IC{
        Integer b = 20;
        void m2(){
            System.out.println(a);//Inner classes can OC instance variables and methods but reverse is not possible
            m1();
        }
    }
    void m1(){
        System.out.println("m1");
        //System.out.println(b); -- Not possible
    }
}
