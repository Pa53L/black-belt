package lambda;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.function.Predicate;

public class StudentInfo {

    void testStudents(ArrayList<Student> al, StudentChecks sc) {
        for (Student s : al) {
            if (sc.check(s)) {
                System.out.println(s);
            }
        }
    }
}

class Test {
    public static void main(String[] args) {
        Student st1 = new Student("Pavel", 'm', 22, 3, 8.3);
        Student st2 = new Student("Anna", 'f', 20, 4, 8.9);
        Student st3 = new Student("Ivan", 'm', 20, 2, 7.7);
        Student st4 = new Student("Olga", 'f', 21, 5, 8.6);
        Student st5 = new Student("Inga", 'f', 20, 2, 9.0);

        ArrayList<Student> students = new ArrayList<>();
        students.add(st1);
        students.add(st2);
        students.add(st3);
        students.add(st4);
        students.add(st5);

        StudentInfo info = new StudentInfo();
        Collections.sort(students, new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                return s1.course - s2.course;
            }
        });
        System.out.println(students);

        Collections.sort(students, (s1, s2) -> s1.age - s2.age);

        System.out.println(students);

        info.testStudents(students, s -> {
            System.out.println("Hello from lambda!");
            return s.avgGrade > 8.0;
        });

        System.out.println("============================");
        StudentChecks sc = (Student s) -> s.sex == 'f';
        info.testStudents(students, sc);
        System.out.println("============================");
        info.testStudents(students, s -> s.age < 21);
        System.out.println("============================");
        info.testStudents(students, (Student s) -> { return s.age > 19 && s.avgGrade < 8.8 && s.sex == 'f'; });
    }
}

@FunctionalInterface
interface StudentChecks {
    boolean check(Student s);
}

class CheckOverGrade implements StudentChecks {
    @Override
    public boolean check(Student s) {
        return s.avgGrade > 8.0;
    }
}
