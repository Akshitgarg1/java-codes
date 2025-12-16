class MyThread extends Thread {
    public MyThread(String name) {
        super(name);
    }

    public void run() {
        System.out.println(Thread.currentThread().getName() + " is running.");
        try {
            // Simulate some work
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName() + " finished.");
    }
}

public class Q1 {
    public static void main(String[] args) {
        MyThread t1 = new MyThread("Thread 1");
        MyThread t2 = new MyThread("Thread 2");

        // Setting priority
        t1.setPriority(Thread.MIN_PRIORITY);
        t2.setPriority(Thread.MAX_PRIORITY);

        // Starting threads
        t1.start();
        t2.start();

        try {
            // Waiting for threads to finish
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Getting priority
        System.out.println("Priority of " + t1.getName() + ": " + t1.getPriority());
        System.out.println("Priority of " + t2.getName() + ": " + t2.getPriority());

        // Using wait and notify
        Object lock = new Object();
        Thread t3 = new Thread(() -> {
            synchronized (lock) {
                System.out.println("Thread 3 waiting...");
                try {
                    lock.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("Thread 3 resumed.");
            }
        });

        t3.start();

        // Sleeping for some time before notifying Thread 3
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        synchronized (lock) {
            lock.notify();
        }

        // Using suspend and resume
        Thread t4 = new Thread(() -> {
            System.out.println("Thread 4 started.");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Thread 4 suspended.");
            Thread.currentThread().suspend(); // Suspending itself
            System.out.println("Thread 4 resumed.");
        });

        t4.start();

        // Sleeping for some time before resuming Thread 4
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        t4.resume();
    }
}
