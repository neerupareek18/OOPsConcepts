package Ex_18082024.ExceptionHandling.try_catch;

public class Lab03 {
    public static void main(String[] args) {
        double pi = 3.14;
        int a =10;
        try {
            int x = 10/0;
        } catch (Throwable e) { //We can also write the parent class reference also
            throw new RuntimeException(e);
        } finally {
            System.out.println("I will be executed anyhow");
        }

    }
}
