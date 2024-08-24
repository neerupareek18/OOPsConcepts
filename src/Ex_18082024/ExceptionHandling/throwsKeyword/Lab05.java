package Ex_18082024.ExceptionHandling.throwsKeyword;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Lab05 {
    public static void main(String[] args) {
        String path = "C://logs";
        File file = new File(path);
        try {
            FileReader fr = new FileReader(file); //This is giving the red underlined error
            //Can be handled in two ways -- try catch and using throw
        } catch (FileNotFoundException e) {
            System.out.println("FNF");
        }
        catch(Exception e){
            System.out.println("E");
        }
        //Smaller Exception basket then Bigger basket is possible but reverse is not possible
    }
}
