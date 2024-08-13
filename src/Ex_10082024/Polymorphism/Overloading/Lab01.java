package Ex_10082024.Polymorphism.Overloading;

public class Lab01 {
    public static void main(String[] args) {
        MathOperators m = new MathOperators();
        System.out.println(m.add(3l, 5l));
        System.out.println(m.add(3, 5));
        System.out.println(m.add(3.5,5.5)); //These both are calling the double add method as the int one is private
    //Based on the paramters sent, it will call the method accordingly, compiler can decide this

        System.out.println(m.add("a",'b')); //This is possible 'b' will be considered as int in this case -- 98 will be returned
        //System.out.println(m.add(98)); -- not allowed
    }
}
