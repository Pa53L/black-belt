package ThreadSafe;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class SynchronizedCollectionEx2 {
    public static void main(String[] args) throws InterruptedException {
        ArrayList<Integer> arrayList = new ArrayList<>();

        for (int i = 0; i < 1000; i++) {
            arrayList.add(i);
        }
        List<Integer> list = Collections.synchronizedList(arrayList);

        Runnable runnable1 = () -> {
            synchronized (list) {
                Iterator<Integer> iterator = list.iterator();
                while (iterator.hasNext()) {
                    System.out.println(iterator.next());
                }
            }
        };
        Runnable runnable2 = () -> list.remove(10);
        Thread t1 = new Thread(runnable1);
        Thread t2 = new Thread(runnable2);
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println(list);
    }


}
