package Ex_04082024.Inheritance.SingleInheritance;

public class Python extends Programming{
    Python(){
        super("Version2"); //without this, error is coming
        System.out.println("Python 'IS-A' type of programming");
    }
}
