public class Threads {
    public static void main(String[] args) throws InterruptedException {
        /*
         * thread = A thread of execution in a program (kind of like a virtual CPU)
         * The JVM allows an application to have multiple threads running concurrently
         * Each thread can execute parts of your code in parallel with the main thread
         * Each thread has a priority.
         * Threads with higher priority are executed in preference compared to threads
         * with a lower priority
         * 
         * The Java Virtual Machine continues to execute threads until either of the
         * following occurs
         * 1. The exit method of class Runtime has been called
         * 2. All user threads have died
         * 
         * When a JVM starts up, there is a thread which calls the main method
         * This thread is called “main”
         * 
         * Daemon thread is a low priority thread that runs in background to perform
         * tasks such as garbage collection
         * JVM terminates itself when all user threads (non-daemon threads) finish their
         * execution
         */

        // Print the number of active threads in the JVM
        System.out.println("Active thread count: " + Thread.activeCount());

        // Create and start a new thread
        MyThread thread2 = new MyThread();
        thread2.setDaemon(true); // Set thread as daemon
        thread2.setName("2nd thread");
        thread2.setPriority(Thread.MIN_PRIORITY); // Set minimum priority
        thread2.start(); // Start the thread

        // Print thread properties and check if it is alive
        System.out.println("Thread name: " + thread2.getName());
        System.out.println("Thread priority: " + thread2.getPriority());
        System.out.println("Is thread daemon? " + thread2.isDaemon());
        System.out.println("Is thread alive? " + thread2.isAlive());

        // Sleep main thread to allow the new thread to execute
        Thread.sleep(1000); // Sleep for 1 second

        // Print active thread count after starting the new thread
        System.out.println("Active thread count after starting new thread: " + Thread.activeCount());

        // Print main thread details
        Thread mainThread = Thread.currentThread();
        mainThread.setName("MAIN");
        mainThread.setPriority(Thread.MAX_PRIORITY); // Set maximum priority
        System.out.println("Main thread name: " + mainThread.getName());
        System.out.println("Main thread priority: " + mainThread.getPriority());
        System.out.println("Is main thread alive? " + mainThread.isAlive());

        // Countdown and message
        for (int i = 3; i > 0; i--) {
            System.out.println(i);
            Thread.sleep(1000); // Sleep for 1 second
        }
        System.out.println("You are done!");

        // Wait for the daemon thread to finish before exiting
        thread2.join(); // Ensure main thread waits for thread2 to complete
        System.out.println("Daemon thread has finished.");
    }
}

class MyThread extends Thread {

    @Override
    public void run() {
        // Print whether the thread is a daemon or a user thread
        if (this.isDaemon()) {
            System.out.println("This is a daemon thread that is running");
        } else {
            System.out.println("This is a user thread that is running");
        }
    }
}
