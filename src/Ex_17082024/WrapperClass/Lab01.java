package Ex_17082024.WrapperClass;

public class Lab01 {
    public static void main(String[] args) {
        int a =10;
        //Primitive Data Type
        //We don't have any functions to apply on these data types
        System.out.println(a);

        //Java likes everything should be a class or object
        //Integer -- class which has multiple functions/utilities

        Integer a1 = 10;
        a1.compareTo(10);
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);

        //Wrapper Class -- Collection Framework does not support Primitive Data Types, it supports wrapper
        //Wrapper - Storing null values, Object can be null
        //Objects wraps or contains primitive data types
        //Coverts Priitive Data Type to Object

        //When user is working witht he advance storage of data, primitve dt are not supported

        //In API and Web Automation -- avoid primitive dt
        //Primitive DT are useful when core java basic programs are being written
    }
}
