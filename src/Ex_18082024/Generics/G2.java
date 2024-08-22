package Ex_18082024.Generics;

import javax.print.attribute.standard.PagesPerMinute;

public class G2 {
    public static <T1, T2, T3> void display (T1 a, T2 b, T3 c){
        System.out.println(((Integer)(a)+1));
        System.out.println(((Double) (b)+1));
    }

    public static void main(String[] args) {
        display(10, 4.5, "String");
    }
}
