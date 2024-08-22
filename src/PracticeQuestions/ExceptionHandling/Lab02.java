package PracticeQuestions.ExceptionHandling;

public class Lab02 {

    public static void main(String[] args) {
        try{method1();}
        catch(Exception e){
            System.out.println("Exception");
        }
    }
    static void method1() throws Exception{
        method2();
    }
    static void method2() throws Exception{
        throw method3();
    }
    static Exception method3(){
        return new Exception();
    }
}
