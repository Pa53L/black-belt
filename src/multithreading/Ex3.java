package multithreading;

public class Ex3 implements Runnable {
    public static void main(String[] args) {
        Thread thread = new Thread(new Ex3());
        thread.start();
        for (int i = 1; i <= 1000; i++) {
            System.out.println(i);
        }
//        Thread myThread3 = new Thread(new MyThread3());
//        Thread myThread4 = new Thread(new MyThread4());
//        myThread3.start();
//        myThread4.start();
    }


    @Override
    public void run() {
        for (int i = 1000; i > 0; i--) {
            System.out.println(i);
        }
    }

}

//class MyThread3 implements Runnable {
//
//    @Override
//    public void run() {
//        for (int i = 1; i <= 1000; i++) {
//            System.out.println(i);
//        }
//    }
//}
//
//class MyThread4 implements Runnable {
//
//    @Override
//    public void run() {
//        for (int i = 1000; i > 0; i--) {
//            System.out.println(i);
//        }
//    }
//}