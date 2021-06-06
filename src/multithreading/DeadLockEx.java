package multithreading;

public class DeadLockEx {
    public static final Object lock1 = new Object();
    public static final Object lock2 = new Object();

    public static void main(String[] args) {
        Thread10 t10 = new Thread10();
        Thread20 t20 = new Thread20();
        t10.start();
        t20.start();
    }
}

class Thread10 extends Thread {
    public void run() {
        System.out.println("Thread10: попытка захватить монитор объекта lock1");
        synchronized (DeadLockEx.lock1) {
            System.out.println("Thread10: монитор объекта lock1 захвачен");
            System.out.println("Thread10: попытка захватить монитор объекта lock2");
            synchronized (DeadLockEx.lock2) {
                System.out.println("Thread10: монитор объектов lock1 и lock2 захвачены");
            }
        }
    }
}

class Thread20 extends Thread {
    public void run() {
        System.out.println("Thread20: попытка захватить монитор объекта lock2");
        synchronized (DeadLockEx.lock2) {
            System.out.println("Thread20: монитор объекта lock2 захвачен");
            System.out.println("Thread20: попытка захватить монитор объекта lock1");
            synchronized (DeadLockEx.lock1) {
                System.out.println("Thread20: монитор объектов lock1 и lock2 захвачены");
            }
        }
    }
}