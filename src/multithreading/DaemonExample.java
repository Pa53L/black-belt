package multithreading;

public class DaemonExample {
    public static void main(String[] args) {
        System.out.println("Main thread starts");
        UserThread userThread = new UserThread();
        userThread.setName("user_Thread");
        DaemonThread daemonThread = new DaemonThread();
        daemonThread.setName("daemon_Thread");
        daemonThread.setDaemon(true);
        userThread.start();
        daemonThread.start();

        System.out.println("Main thread ends");
    }
}

class UserThread extends Thread {
    public void run() {
        System.out.println(Thread.currentThread() +
                "is Daemon: " + isDaemon());
        for (char i = 'a'; i <= 'j'; i++) {
            try {
                sleep(300);
                System.out.println(i);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class DaemonThread extends Thread {
    public void run() {
        System.out.println(Thread.currentThread() +
                "is Daemon: " + isDaemon());
        for (int i = 1; i <= 1000; i++) {
            try {
                sleep(100);
                System.out.println(i);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
