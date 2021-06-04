package multithreading;

public class Ex5 {
    public static void main(String[] args) {
        MyThread5 thread5 = new MyThread5();
        thread5.setName("moy_potok");
        thread5.setPriority(Thread.MAX_PRIORITY);
        System.out.println("My thread5's name: " + thread5.getName() +
                "\npriority of thread5: " + thread5.getPriority());

    }


}

class MyThread5 extends Thread {
    public void run() {
        System.out.println("Hello");
    }
}
