package Ex_18082024.MultiThreading;

public class Lab04 {

    public static void main(String[] args) {
        Runnable r = new WorkerLab04();
        Thread t1 = new Thread(r);
        t1.start();

        Runnable r1 = new WorkerLab04();
        Thread t2 = new Thread(r1);
        t2.start();

        //We cannot start t1 again -- t1.start() again is not possible
    }
}
//Creating the thread using Runnable Interface
class WorkerLab04 implements Runnable {
    @Override
    public void run() {
        for (int j = 1; j < 10; j++) {
            try {
                Thread.currentThread().setPriority(1);
                System.out.println(Thread.currentThread().getName());
            } catch (Exception e) {
                e.getMessage();
            }

        }
    }
}


