package Ex_18082024.ExceptionHandling.throwsKeyword;

public class Lab04 {
    /*
    Exception Passing --
     */
    public static void main(String[] args) {
        extracted();

    }

    private static void extracted() {
        extracted1();
    }

    private static void extracted1() {
        try {
            Integer i[] = new Integer[3];
            System.out.println(i[3]);
        } catch (Exception e) {
            System.out.println("Array Index Out Of Bound");
        } finally {
            System.out.println("Finally");
            //Scanner.close(), fil.close(), sqlconnection.close(), etc.
        }
        System.out.println("End of Program");
    }

    //Exception passing is the concept of tracing the exception lines -- need to trace from bottom to top
    //so try catch should be added in the vunerable code


}
