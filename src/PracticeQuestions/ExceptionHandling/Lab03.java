package PracticeQuestions.ExceptionHandling;

public class Lab03 {
    public static void main(String[] args) {
        try{
            return;
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
        finally{
            System.out.println("Finally");
        }
    }
}
