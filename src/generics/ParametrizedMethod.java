package generics;

import java.util.ArrayList;
import java.util.List;

public class ParametrizedMethod {
    public static void main(String[] args) {
        List<String> al1 = new ArrayList<>();
        al1.add("Hello");
        al1.add("Pavel");
        System.out.println(GenMethod.getSecondElement(al1));

        List<Integer> al2 = new ArrayList<>();
        al2.add(213);
        al2.add(124);
        al2.add(423463);
        System.out.println(GenMethod.getSecondElement(al2));
    }

}

class GenMethod {
    public static <T> T getSecondElement(List<T> al) {
        return al.get(1);
    }
}