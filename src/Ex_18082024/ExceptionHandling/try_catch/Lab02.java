package Ex_18082024.ExceptionHandling.try_catch;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Lab02 {
    public static void main(String[] args) throws FileNotFoundException {
        //Checked
        try {
            FileInputStream fi = new FileInputStream("logs"); //On writing this line, JVM shows the red error to add the Exception for IO
            //This is checked Exception
            fi.read(); }//It shows red underline
//        } catch (FileNotFoundException e) { -- File Not Found is already added in the method signature
//            System.out.println(e.getMessage());
//        }
            catch(IOException e){
            e.printStackTrace(); //So need to add the Exception for fi.read(), not for File not Found
            }
        }
    }

