package collection;

import java.util.ArrayList;

public class ArrayListMethods {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Pasha");
        arrayList.add("Anya");
        System.out.println(arrayList);
        arrayList.add(1, "Vstavka");
        arrayList.add("NewName");


        System.out.println(arrayList);
        arrayList.set(3, "ChangedName");
        System.out.println(arrayList);

        for (String s : arrayList) {
            System.out.println("String now is - " + s);
        }

        System.out.println(arrayList.get(0));
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println(arrayList.get(i));
        }
        arrayList.remove(2);
        arrayList.remove("ChangedName");
        System.out.println(arrayList);
    }

}
