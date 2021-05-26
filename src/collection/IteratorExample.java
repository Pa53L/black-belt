package collection;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorExample {
    public static void main(String[] args) {
        ArrayList<String> arrayList1 = new ArrayList<>();
        arrayList1.add("Pasha");
        arrayList1.add("Sasha");
        arrayList1.add("Anya");
        arrayList1.add("Marina");
        arrayList1.add("Kolya");
        arrayList1.add("Tolya");

        Iterator<String> iterator = arrayList1.iterator();
        while(iterator.hasNext()) {
            System.out.println(iterator.next());
            iterator.remove();
        }
        System.out.println(arrayList1);
    }
}
