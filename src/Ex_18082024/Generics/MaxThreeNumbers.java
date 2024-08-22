package Ex_18082024.Generics;

public class MaxThreeNumbers {
    public static void main(String[] args) {
        //34, 54, 76
        //4.2, 3.4, 1.2
        //p, z, a

        //If we want to know maximum for different datatypes, we need to write 3 different functions, Generics solve this problem
int maxInt = maxInt(30, 40, 20);
        System.out.println(maxInt);

        //int maxDouble = maxInt(4.2,5.4,5.7) -- Not possible, we need to create a new method for double
    }

    public static int maxInt(int a, int b, int c) {
        int max = a;
        if (b > max) {
            max = b;
        }
        if (c > max) {
            max = c;
        }
return max;
    }
}


