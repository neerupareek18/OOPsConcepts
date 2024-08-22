package PracticeQuestions.ExceptionHandling;

public class Lab04 {
    public static void amethod() throws Exception{
        try{
            throw new Exception();
        }
        finally{
            System.out.println("Finally");
        }
    }

    public static void main(String[] args) {
        try{
            amethod();
        }
        catch (Exception e){
            System.out.println("Exception");
        }
        finally{
            System.out.println("Finished");
        }
    }
}
