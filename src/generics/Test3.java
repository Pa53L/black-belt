package generics;

import java.util.ArrayList;
import java.util.List;

public class Test3 {
    public static void main(String[] args) {
        List<String> list1 = new ArrayList<>();
        list1.add("Hello");
        list1.add("Pavel");
        list1.add("Programmer");

        List<Integer> list2 = new ArrayList<>();
        list2.add(12321);
        list2.add(32);
        list2.add(564);
        showListInfo(list1);
        showListInfo(list2);

        ArrayList<Double> list3 = new ArrayList<>();
        list3.add(3.14);
        list3.add(3.15);
        list3.add(3.16);
        showListInfo(list3);

        double d = sum(list3);
        System.out.println(d);

        ArrayList<Integer> intl = new ArrayList<>();
        intl.add(57);
        intl.add(6857);
        intl.add(678);
        System.out.println(sum(intl));
    }

    static void showListInfo(List<?> list) {
        System.out.println("List contains: " + list);
    }

    public static double sum(ArrayList<? extends Number> list) {
        double sum = 0.0;
        for (Number d : list) {
            sum += d.doubleValue();
        }

        return sum;
    }
}
