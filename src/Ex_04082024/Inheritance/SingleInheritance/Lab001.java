package Ex_04082024.Inheritance.SingleInheritance;

public class Lab001 {
    public static void main(String[] args) {
        Son s = new Son();
        s.bhk3();
        s.bhk2();

        Father f = new Son();
        f.bhk2();
        //f.bhk3(); -- father cannot use Son's function
    }
}
