package lambda;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.function.Predicate;

public class StudentInfoPredicate {

    void testStudents(ArrayList<Student> al, Predicate<Student> pr) {
        for (Student s : al) {
            if (pr.test(s)) {
                System.out.println(s);
            }
        }
    }
}

class TestPredicate {
    public static void main(String[] args) {
        Student st1 = new Student("Pavel", 'm', 22, 3, 8.3);
        Student st2 = new Student("Anna", 'f', 20, 4, 8.9);
        Student st3 = new Student("Ivan", 'm', 20, 2, 7.7);
        Student st4 = new Student("Olga", 'f', 21, 5, 8.0);
        Student st5 = new Student("Inga", 'f', 20, 2, 9.0);

        ArrayList<Student> students = new ArrayList<>();
        students.add(st1);
        students.add(st2);
        students.add(st3);
        students.add(st4);
        students.add(st5);

        StudentInfoPredicate info = new StudentInfoPredicate();
        Predicate<Student> p1 = student -> student.avgGrade > 8.2;
        Predicate<Student> p2 = student -> student.sex == 'f';

        info.testStudents(students, p1);
        System.out.println("============================");
        info.testStudents(students, p2);
        System.out.println("============================");
        info.testStudents(students, p1.and(p2));
        System.out.println("============================");
        info.testStudents(students, p1.or(p2));
        System.out.println("============================");
        info.testStudents(students, p1.negate());

    }
}
