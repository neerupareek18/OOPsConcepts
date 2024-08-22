package Ex_17082024.ExceptionHandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Lab02 {
    public static void main(String[] args) throws FileNotFoundException {
        //Checked
        try {
            FileInputStream fi = new FileInputStream("logs"); //On writing this line, JVM shows the red error to add the Exception for IO
            //This is checked Exception
            //fi.read(); //It shows red underline
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }
}
