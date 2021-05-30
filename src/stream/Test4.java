package stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Test4 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(3);
        list.add(56);
        list.add(88);
        list.add(42);

        int result = list.stream().reduce((accumulator, element) -> accumulator*element).get();
        System.out.println("Result: " + result);
        // 5, 3, 56, 88, 42
        // accumulator = 5 5*3 15*56 ... 3104640
        // element =     3  56    88 ...

        int resultNext = list.stream().reduce(1, (accumulator, element) -> accumulator*element);
        // accumulator = 1 Передается начальное значение аккумулятора
        System.out.println("ResultNext: " + resultNext);

        List<String> list3 = new ArrayList<>();
        list3.add("string one");
        list3.add("two");
        list3.add("three");
        list3.add("four");
        list3.add("five");
        String res = list3.stream().reduce((a, e) -> a + " " + e).get();
        System.out.println("res: " + res);

        List<Integer> list1 = new ArrayList<>();
        Optional<Integer> result1 = list.stream().reduce((accumulator, element) -> accumulator*element);
        Optional<Integer> result2 = list1.stream().reduce((accumulator, element) -> accumulator*element);
        if (result1.isPresent()) {
            System.out.println("result1: " + result1);
        } else {
            System.out.println("Optional is Empty!");
        }

        if (result2.isPresent()) {
            System.out.println(result2);
        } else {
            System.out.println("result2: Optional is Empty!");
        }
    }
}
