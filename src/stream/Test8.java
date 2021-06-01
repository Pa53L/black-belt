package stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.stream.Collectors;

public class Test8 {
    public static void main(String[] args) {
        Student st1 = new Student("Pavel", 'm', 22, 3, 8.3);
        Student st2 = new Student("Anna", 'f', 20, 4, 8.9);
        Student st3 = new Student("Ivan", 'm', 23, 2, 7.7);
        Student st4 = new Student("Olga", 'f', 21, 5, 8.0);
        Student st5 = new Student("Inga", 'f', 30, 2, 9.0);

        List<Student> students = new ArrayList<>();
        students.add(st1);
        students.add(st2);
        students.add(st3);
        students.add(st4);
        students.add(st5);

        Map<Integer, List<Student>> map = students.stream().map(el -> {el.setName(el.getName().toUpperCase(Locale.ROOT));
                return el;
        })
                .collect(Collectors.groupingBy(el -> el.getCourse()));

        for (Map.Entry<Integer, List<Student>> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }

        Map<Boolean, List<Student>> m2 = students.stream().collect(Collectors.partitioningBy(el -> el.getAvgGrade() > 8.2));
        for (Map.Entry<Boolean, List<Student>> entry : m2.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }

    }
}
