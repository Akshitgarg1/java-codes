// SharedResource class that will be used by both Producer and Consumer
class SharedResource {
    int i;
    boolean bool = false;

    public synchronized void put(int i) {
        while (bool) {
            try {
                wait();
            } catch (InterruptedException e) {
                System.out.println("InterruptedException caught");
            }
        }
        this.i = i;
        bool = true;
        System.out.println("Put: " + i);
        notify();
    }

    public synchronized int get() {
        while (!bool) {
            try {
                wait();
            } catch (InterruptedException e) {
                System.out.println("InterruptedException caught");
            }
        }
        bool = false;
        System.out.println("Got: " + i);
        notify();
        return i;
    }
}

// Producer class
class Producer implements Runnable {
    SharedResource resource;

    Producer(SharedResource resource) {
        this.resource = resource;
        new Thread(this, "Producer").start();
    }

    public void run() {
        int i = 0;
        while (true) {
            resource.put(i++);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Producer interrupted");
            }
        }
    }
}

// Consumer class
class Consumer implements Runnable {
    SharedResource resource;

    Consumer(SharedResource resource) {
        this.resource = resource;
        new Thread(this, "Consumer").start();
    }

    public void run() {
        while (true) {
            resource.get();
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Consumer interrupted");
            }
        }
    }
}

// ProducerConsumer class
public class Pc {
    public static void main(String[] args) {
        SharedResource resource = new SharedResource();
        System.out.println("Press Control+c to exit");
        new Producer(resource);
        new Consumer(resource);
    }
}
