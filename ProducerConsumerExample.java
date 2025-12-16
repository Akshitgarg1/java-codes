import java.util.LinkedList;
import java.util.Queue;

class SharedBuffer {
    private final Queue<Integer> buffer;
    private final int maxSize;

    public SharedBuffer(int maxSize) {
        this.buffer = new LinkedList<>();
        this.maxSize = maxSize;
    }

    public synchronized void produce(int value) throws InterruptedException {
        while (buffer.size() == maxSize) {
            wait();
        }
        buffer.add(value);
        System.out.println("Produced: " + value);
        notifyAll();
    }

    public synchronized int consume() throws InterruptedException {
        while (buffer.isEmpty()) {
            wait();
        }
        int value = buffer.poll();
        System.out.println("Consumed: " + value);
        notifyAll();
        return value;
    }
}

class Producer implements Runnable {
    private final SharedBuffer sharedBuffer;

    public Producer(SharedBuffer sharedBuffer) {
        this.sharedBuffer = sharedBuffer;
    }

    @Override
    public void run() {
        int value = 0;
        try {
            while (true) {
                sharedBuffer.produce(value++);
                Thread.sleep(100); // Simulate time taken to produce an item
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}

class Consumer implements Runnable {
    private final SharedBuffer sharedBuffer;

    public Consumer(SharedBuffer sharedBuffer) {
        this.sharedBuffer = sharedBuffer;
    }

    @Override
    public void run() {
        try {
            while (true) {
                sharedBuffer.consume();
                Thread.sleep(150); // Simulate time taken to consume an item
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}

public class ProducerConsumerExample {
    public static void main(String[] args) {
        SharedBuffer sharedBuffer = new SharedBuffer(5); // Buffer size of 5

        Thread producerThread = new Thread(new Producer(sharedBuffer));
        Thread consumerThread = new Thread(new Consumer(sharedBuffer));

        producerThread.start();
        consumerThread.start();
    }
}
