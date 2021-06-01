package stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ParallelStream {
    public static void main(String[] args) {
        List<Double> list = new ArrayList<>();
        list.add(10.0);
        list.add(5.0);
        list.add(8.0);
        list.add(12.5);

        for (int i = 0; i < 10000000; i++) {
            double d = new Random().nextDouble();
            list.add(d);
        }

        long start1 = System.currentTimeMillis();
        double sumSingle = list.stream().reduce((acc, el) -> acc+el).get();
        long finish1 = System.currentTimeMillis();
        System.out.println(finish1 - start1);
        System.out.println(sumSingle);

        long start2 = System.currentTimeMillis();
        double sumRes = list.parallelStream().reduce((acc, el) -> acc + el).get();
        long finish2 = System.currentTimeMillis();
        System.out.println(finish2 - start2);

        System.out.println("diff: " + ((finish1 - start1) - (finish2 - start2)));
        System.out.println(sumRes);
    }
}
