package multithreading;

public class Ex2 extends Thread {
    public void run() {
        for (int i = 0; i <= 1000; i++) {
            System.out.println("Ex2 run : " + i);
        }
    }
    public static void main(String[] args) {

        Ex2 ex2 = new Ex2();
        MyThread1 myThread1 = new MyThread1();
        MyThread2 myThread2 = new MyThread2();
        ex2.start();
        myThread1.start();
        myThread2.start();
        for (int i = 1000; i > 0; i--) {
            System.out.println("main: " + i);
        }
    }
}

class MyThread1 extends Thread {
    public void run() {
        for (int i = 1; i <= 1000; i++) {
            System.out.println("T1: " + i);
        }
    }
}

class MyThread2 extends Thread {
    public void run() {
        for (int i = 1000; i > 0; i--) {
            System.out.println("T2: " + i);
        }
    }
}
