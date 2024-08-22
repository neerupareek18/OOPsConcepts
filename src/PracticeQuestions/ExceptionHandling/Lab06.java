package PracticeQuestions.ExceptionHandling;

import jdk.jshell.spi.ExecutionControlProvider;

public class Lab06 {
    public static void badMethod(){
        throw new Error();
    }

    public static void main(String[] args) {
try{
    badMethod();
}
//catch (Error e){
//    System.out.println("Error");
//}
catch(Exception e1){
    System.out.println("Exception");
}
finally{
    System.out.println("Finally");
}
        System.out.println("Finished");
    }
}
