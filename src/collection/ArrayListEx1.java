package collection;

import java.util.ArrayList;
import java.util.List;

public class ArrayListEx1 {
    public static void main(String[] args) {
        ArrayList<String> arrayList1 = new ArrayList<String>();
        arrayList1.add("Pavel");
        arrayList1.add("Ivan");
        arrayList1.add("Maria");
        System.out.println(arrayList1);

        ArrayList<String> arrayList2 = new ArrayList<>(200);
        arrayList2.add("Name");
        arrayList2.add("MoreName");
        arrayList2.add("OneMoreName");
        System.out.println(arrayList2);

        List<String> list = new ArrayList<>();
        list.add("NewInitialization");
        list.add("GoodInit");
        System.out.println(list);

        ArrayList<String> arrayList3 = new ArrayList<>(list);
        arrayList3.addAll(arrayList2);
        System.out.println(arrayList3);
        arrayList3.add("newString");
    }
}
