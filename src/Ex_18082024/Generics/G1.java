package Ex_18082024.Generics;

public class G1 {
    public static <T> void temp (T a){
        System.out.println(a);
    }

    //Need to write the keyword (any) even in the case of void

    public static void main(String[] args) {
        temp(9);
        temp(9.5);
        temp("String");
        temp('c');
    }
}
