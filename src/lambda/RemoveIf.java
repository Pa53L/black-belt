package lambda;

import java.util.ArrayList;
import java.util.function.Predicate;

public class RemoveIf {
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<>();
        al.add("privet");
        al.add("how");
        al.add("are");
        al.add("you");
        al.add("I'm fine");
        al.add("just");
        al.add("very good");

        System.out.println(al);
//        al.removeIf(s -> s.length() < 5);
        Predicate<String> pr = element -> element.length() < 5;
        al.removeIf(pr);
        System.out.println(al);

    }
}
