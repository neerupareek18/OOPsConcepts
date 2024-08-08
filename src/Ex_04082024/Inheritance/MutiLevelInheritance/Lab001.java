package Ex_04082024.Inheritance.MutiLevelInheritance;

public class Lab001 {
    public static void main(String[] args) {
        Child c = new Child();
        c.home1();
        c.home2();
        c.home3();
        c.common();

        Father f = new Child();
        f.home1();
        f.home2();
        //f.home3() will not be possbile even if the object is of child, it looks with the Class name
f.common();
        Grndfthr g = new Child();
        g.home1();
        g.common();

        Father f1 = new Father();
        f1.home1();
        f1.home2();
        f1.common();




    }
}
