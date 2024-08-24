package Ex_18082024.ExceptionHandling.thowKeyword;

import java.util.Scanner;

public class Lab02 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String name = s.nextLine();
        if(name.equalsIgnoreCase("Neeru")){
            try {
                throw new Exception("Not Allowed"); //surround it with try-catch block
                //JVm does not knows about this Exception -- so throw a custom exception
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
            finally{
                System.out.println("End");
            }
            //System.out.println("End of Program"); ------- Not allowed here
        }
        System.out.println("End of Program"); //Thi will not be executed -- the exception is thrown an returned
        //But finally is to be executed anyhow

        /*
        throw is used to create an Exception
        try catch is used to handle the exception
         */

    }
}
