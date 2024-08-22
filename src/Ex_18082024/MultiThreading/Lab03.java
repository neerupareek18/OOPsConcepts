package Ex_18082024.MultiThreading;

public class Lab03 {
    public static void main(String[] args) {
        //Task 1 -- Go from 1 - 5

        //We can assing the Thread Group and name of the thread by ourselves, need to write the constructor in thread class
        //Also,

        ThreadGroup tg = new ThreadGroup("Worker");
        WorkerLab03 w1 = new WorkerLab03(tg, "W1");
        //We need to start the Thread before running it
        //Whenever run is called directly, it will behave like a normal method and will not take the advantage of multithreading
        // JVM will not create a new thread that is why calling start() is imp.
        w1.start();
        //start is also a native method

        WorkerLab03 w2 = new WorkerLab03(tg, "W2");
        w2.start();
//This is done by main thread
        for(int i=0;i<5;i++){
            try{
                System.out.println(Thread.currentThread().getName()+" "+Thread.currentThread().getThreadGroup());
            }
            catch (Exception e){
                e.getMessage();
            }

        }

    }

}
//Creating a thread
class WorkerLab03 extends Thread{
    WorkerLab03(ThreadGroup tg, String name){
    super(tg,name);
    }

//If we want to assign the task , we need to give the task in run method
    @Override
    public void run() {
        for(int i=0;i<5;i++){
            try{
                System.out.println(Thread.currentThread().getName()+" "+Thread.currentThread().getThreadGroup());
            }
            catch (Exception e){
                e.getMessage();
            }

        }
    }
}

//For the other task, we need to create a new workerClass and assign that task to it (run method)

//

class Worker1Lab03 extends Thread {
    @Override
    public void run() {
        for (int j = 1; j < 10; j++) {
            try {
                System.out.println(Thread.currentThread().getName());
            } catch (Exception e) {
                e.getMessage();
            }

        }
    }
}
