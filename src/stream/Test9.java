package stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Test9 {
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

        Student min = students.stream().min((e1, e2) -> e1.getAge() - e2.getAge()).get();
        System.out.println(min);
        Student max = students.stream().max((s1, s2) -> s1.getAge() - s2.getAge()).get();
        System.out.println(max);

        System.out.println("-----------------------------------------------------");
        students.stream().filter(e->e.getAge()>20).forEach(System.out::println);
        System.out.println("-----------------------------------------------------");
        students.stream().filter(e -> e.getAge() > 20).limit(2).forEach(System.out::println);
        System.out.println("-----------------------------------------------------");
        students.stream().filter(e->e.getAge() > 20).skip(2).forEach(System.out::println);
        System.out.println("-----------------------------------------------------");

        List<Integer> ages = students.stream()
                .mapToInt(e->e.getAge())
                .boxed()
                .collect(Collectors.toList());

        System.out.println(ages);


        System.out.println("-----------------------------------------------------");
        List<Double> grades = students.stream()
                .mapToDouble(e->e.getAvgGrade())
                .boxed()
                .collect(Collectors.toList());

        System.out.println(grades);

        System.out.println("-----------------------------------------------------");
        int sum = students.stream().mapToInt(el -> el.getCourse()).sum();
        System.out.println(sum);

        System.out.println("-----------------------------------------------------");
        double avg = students.stream().mapToInt(el -> el.getCourse()).average().getAsDouble();
        System.out.println(avg);
        System.out.println("-----------------------------------------------------");
        int min2 = students.stream().mapToInt(el -> el.getCourse()).min().getAsInt();
        System.out.println(min2);
        System.out.println("-----------------------------------------------------");
        int max2 = students.stream().mapToInt(el -> el.getCourse()).max().getAsInt();
        System.out.println(max2);

    }

}
