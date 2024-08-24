package Ex_18082024.ExceptionHandling.thowKeyword;

import java.util.Scanner;

public class Lab03 {
    public static void main(String[] args){
        Scanner s= new Scanner(System.in);
        int i = s.nextInt();

        if(i==0){
            throw new ArithmeticException("Enter non zero number");
            //Not giving the Exception to JVM, coder has given the Exception to the user
        }
        //If we write Exception , then we need to add it in method signature or add try-catch around it

        //Checked Exception cannot be propagated using throw
    }
}
