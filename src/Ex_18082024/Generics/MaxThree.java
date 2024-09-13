package Ex_18082024.Generics;

public class MaxThree {
    public static <DT extends Comparable <DT>> DT maxof(DT a, DT b, DT c){
        //compareTo compare both numeral and string
        //DT becomes a customer/user defined class
        DT max = a;
        if(b.compareTo(max)>0){
            max =b;
        }
        if(c.compareTo(max)>0){
            max=c;
        }
return max;
    }

    public static void main(String[] args) {
        System.out.println(maxof(3.1, 4.5, 6.7));
    }
}
