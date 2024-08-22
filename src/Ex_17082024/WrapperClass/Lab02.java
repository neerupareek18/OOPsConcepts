package Ex_17082024.WrapperClass;

public class Lab02 {
    public static void main(String[] args) {
//Primitive to Wrapper,
int a =10;
Integer b = a;
        System.out.println(b); //utilities are added
// Wrapper to Primitive

        Integer a2 = 80; //Auto-boxing -- int-->Integer automatically
        int value = a2; //Unboxing -- Interger -->int
        System.out.println(a2);
        System.out.println(value); //we lose the functionalities

    }
}
