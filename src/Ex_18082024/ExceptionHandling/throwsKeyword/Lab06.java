package Ex_18082024.ExceptionHandling.throwsKeyword;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Lab06 { //FileNotFoundException is grayed out as IOException is there, if we remove it it will not be grayed
    public static void main(String[] args) throws FileNotFoundException, IOException, NullPointerException, ArithmeticException{
        /*
        Throws -- Used to handle the Exception
        It is attached to the method signature rather than the vunerable code
         */
        readFile(); //This will also give the red underlined error -- need to handle it with throws in parent method as well
        //Need to add all the Exceptions in signature which are in child method
    }

    //Throws halts the program wherever it finds the first Exception *****************

    public static void readFile() throws FileNotFoundException, IOException, NullPointerException, ArithmeticException {//This looks more cleaner code than the try-catch
        String path = "C:/Users/Neeru/Documents/QuoteFor1A9DVN4KLF9FJ40FL_02012024162051.pdf";
        File file = new File(path);
        FileReader fr = new FileReader(file);
        System.out.println("End of File");
        String path1 = "C:/Users/Neeru/Documents/ABC.pdf";
        File file1 = new File(path1);
        FileReader fr1 = new FileReader(file1);
        System.out.println("End of File1");

        int i = 10/0;
        System.out.println("Arithemetic");
    }
}
/*
Throws, try-catch: both are used to handle the exceptions
Try-catch: allowed in block of code, handles only vunerable code
Throws: Works with method level -- implies full method is vunerable
 */