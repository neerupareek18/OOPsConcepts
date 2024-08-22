package Ex_17082024.WrapperClass;

public class Lab04 {
    public static void main(String[] args) {
        //Integer a = new Integer(42); This code was possible before Java 9, then it has been removed
        //We can directly assignt he value now --

        Integer a = 10;
        Double d = 3.14;
        double val = d.doubleValue();
        System.out.println(val);
        
        //No difference but memory is different
        //Double -- in heap as this is object, double -- continuous memory location as this primitive
    }
}
