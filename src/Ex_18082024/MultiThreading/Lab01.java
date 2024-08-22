package Ex_18082024.MultiThreading;

public class Lab01 {
    public static void main(String[] args) {
        //Thread is a Class not an interface
        //creentThread -- static method, native -- not from Java but from 3rd Party (c,c++)
        Thread t = Thread.currentThread();
        for(int i=0;i<5;i++){
            System.out.println(t.getName());
            System.out.println(t.getPriority());
        }
    }
}
