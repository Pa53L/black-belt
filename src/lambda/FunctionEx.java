package lambda;

import java.util.*;
import java.util.function.Predicate;
import java.util.function.Function;

public class FunctionEx {

    void testStudents(ArrayList<Student> al, StudentChecks sc) {
        for (Student s : al) {
            if (sc.check(s)) {
                System.out.println(s);
            }
        }
    }
}

class Test5 {
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

        FunctionEx info = new FunctionEx();

        Function<Student, Double> f = student -> student.avgGrade;

        double res = avgOfSmth(students, student -> student.avgGrade);
        System.out.println(res);



    }

    private static double avgOfSmth(List<Student> list, Function<Student, Double> f) {
        double res = 0;
        for (Student s : list) {
            res += f.apply(s);
        }
        return res / list.size();
    }
}


