package lambda;

import java.util.ArrayList;
import java.util.List;

public class ForEach {
    public static void main(String[] args) {
        List<String> list = List.of("Hello", "how are you", "I'm fine", "and you");
        list.forEach(System.out::println);
        list.forEach(str -> System.out.println(str));

        List<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(3);
        list1.add(15);
        list1.add(8);
        list1.add(6);

        list1.forEach(n -> {
                System.out.println(n);
                n *= 2;
                System.out.println(n);
        });
    }
}
