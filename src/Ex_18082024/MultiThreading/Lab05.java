package Ex_18082024.MultiThreading;

public class Lab05 {
    //Concurrency  -- ability to handle multiple tasks and threads to run simultaneously at a time
    // executing them independently and asynchronously
    //It is just a CPU allocating the time to the tasks so quickly that it appears as the tasks are done at a time
    /*
Web Server -- app.vwo.com -- webserver eengineX accepts multiple request and each request is handled by a separate thread
     */

    // and

    // Parallelism -- allowing to handle the requests and run the thread synchronously using multi-core processor
//------------------------------------------------------------------------------------------------------------

    //Synchronous -- It halts the process A till the execution iProcess B s completed, these programs are slow
    //Asynchronously -- It runs the processes simultaneously -- ex. app.vwo.com -- sign in is clicked but it does not blocks the UI, we can still check the box, edit the username, password


    //Thread Life Cycle --
    /*
    New - Instance creation of the thread which is not yet started by start()
    Runnable -- when start() is called
    Running -- Schedular selected the thread
    Non-Running - Thread is alive but is not eligible to run
    Terminated -- end (after thread termination, it doesn't come back)

Block state -- When the resources are unavailable to perform tasks further -- data not loaded, but UI thread will work
Thread.wait(). -- Thread.notify()/notifyAll() (one thread/All threads) needs to be called to have the thread in ready to run state
Thread.sleep() -- Thread goes to Ready to run state after 5 seconds or the time defined

//When stop() or destroy() method is called, thread in DEAD state
//When the thread task is completed, the run()method execution is over -- DEAD State/Terminated State
Once, terminated, it will not come back to the CPU time
     */

}
