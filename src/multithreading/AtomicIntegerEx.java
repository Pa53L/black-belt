package multithreading;

import java.util.concurrent.atomic.AtomicInteger;

public class AtomicIntegerEx {
    static AtomicInteger counter = new AtomicInteger(0);

    public static void increment() {
//        counter.incrementAndGet();
//        counter.addAndGet(7);
//        counter.decrementAndGet();
        counter.addAndGet(-7);
    }



    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(new MyRunnableImpl118());
        Thread t2 = new Thread(new MyRunnableImpl118());
        t1.start();
        t2.start();
        t1.join();
        t2.join();

        System.out.println(counter);
    }
}

class MyRunnableImpl118 implements Runnable {

    @Override
    public void run() {
        for (int  i = 0; i < 100000; i++) {
            AtomicIntegerEx.increment();
        }
    }
}
