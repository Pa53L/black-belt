package stream;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test6 {
    public static void main(String[] args) {
        Stream<Integer> stream1 = Stream.of(1,2,3,4,5,6,7,8,1,2,3);
        stream1.filter(el -> {
            System.out.println("!!!!");
            return el % 2 == 0;
        }).collect(Collectors.toList());

        Stream<Integer> stream2 = Stream.of(1,2,3,4,5,6,7,8,1,2,3);
        Stream<Integer> stream3 = Stream.of(15,23,32,41,54,62,7,8,16,23,32);

        List<Integer> l = Stream.concat(stream2, stream3).filter(el -> el % 2 == 1).sorted().collect(Collectors.toList());
        System.out.println(l);

        Stream<Integer> stream4 = Stream.of(1,2,3,4,5,6,7,8,1,2,3,1,2,3,4);
        stream4.distinct().forEach(System.out::println);

        Stream<Integer> stream5 = Stream.of(1,2,3,4,5,6,7,8,1,2,3,1,2,3,4);
        System.out.println("Count: " + stream5.distinct().count());

        Stream<Integer> stream6 = Stream.of(1,2,3,4,5,6,7,8,1,2,3,1,2,3,4);
        System.out.println("Peek: " + stream6.distinct().peek(System.out::println).count());
    }
}
