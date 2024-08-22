package Ex_17082024.WrapperClass;

public class Lab03 {
    public static void main(String[] args) {
        String num = "10";
        //String to Primitive
        int a = Integer.valueOf(num);
        //String to number
        Integer a1 = Integer.valueOf(num); //String to Object--to Primitive DT
        System.out.println(a+1);
        System.out.println(a1+1);

        System.out.println(Integer.parseInt(num));

        //Use of this concept -- when String to int, Integer
        //Primitive to wrapper or reverse

    }
}
