package Ex_17082024.ExceptionHandling;

import java.util.IllegalFormatConversionException;

public class Lab01 {
    //Exceptions -- which occurs during the execution which distrupts the program
    //Error can't be handled -- Thread Death, Stack Overflow, VirtualMemoryError, IOError, etc.
    //Object -- Serialiable -- Throwable -- Error and Exception
    //Checked -- IOException, SQLException, BrokenBarrierException
    // and
    // Unchecked Exception -- Runtime -- Airthemetic, NullPointer

    public static void main(String[] args) {
        try {
            String arg = args[0];
            System.out.println(arg);
            int i2 = 10/0;
            int i = Integer.parseInt(arg);
            int i3 = 10/0;
        }
//        catch (ArrayIndexOutOfBoundsException e) {
//            System.out.println(e.getMessage());
//        }
//        catch (ArithmeticException e){
//            System.out.println(e.getMessage());
//        }
//        catch(NumberFormatException e){
//            System.out.println(e.getMessage());
//        }
        catch(ArrayIndexOutOfBoundsException| ArithmeticException|NumberFormatException e){
            System.out.println(e.getMessage());
            e.printStackTrace(); //printStackTrace will always show at the end in console
        }
        System.out.println("End of the program");
        //If the Exception is handled, the rest of the code will be executed, else the program will be terminated
    }
}

//Flow:
/*
JVM is initialised-- creates the main thread which calls the main method -- Collect the command line arguments
Creates the String array with CLI
Lab01.main(0) will be called
Control is transferred to the main thread - main
When problem occurs -- JVM raises the Exception if it is not handled and terminates the program

 */
