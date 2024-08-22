package Ex_18082024.MultiThreading;

public class Lab02 {
    //JVM will create the main thread -- contains -- TMain, TGC (Garbage Collector), TF(Final)

    //Mian - to run the program
    //TGC -- to delete the i and other things
    //TF -- shut doen the JVM

    public static void main(String[] args) {
        Thread t = Thread.currentThread();
        for(int i =0;i<10;i++){
            System.out.println(t.getName()+" "+t.getThreadGroup()+" "+t.getPriority());
        }
    }
}
