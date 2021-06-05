package multithreading;

public class Ex12 {

    static final Object lock = new Object();

    void mobileCall() {
        synchronized (lock) {
            System.out.println("Mobile call starts");
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Mobile call ends");
        }
    }

    void skypeCall() {
        synchronized (lock) {
            System.out.println("Skype call starts");
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Skype call ends");
        }
    }

    void whatsappCall() {
        synchronized (lock) {
            System.out.println("WhatsApp call starts");
            try {
                Thread.sleep(7000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("WhatsApp call ends");
        }
    }

    public static void main(String[] args) {
        Thread t1 = new Thread(new RunnableImplMobile());
        Thread t2 = new Thread(new RunnableImplSkype());
        Thread t3 = new Thread(new RunnableImplWhatsapp());

        t1.start();
        t2.start();
        t3.start();


    }
}

class RunnableImplMobile implements Runnable {
    @Override
    public void run() {
        new Ex12().mobileCall();
    }
}

class RunnableImplSkype implements Runnable {
    @Override
    public void run() {
        new Ex12().skypeCall();
    }
}

class RunnableImplWhatsapp implements Runnable {
    @Override
    public void run() {
        new Ex12().whatsappCall();
    }
}
