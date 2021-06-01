package stream;

import java.util.ArrayList;
import java.util.List;

public class Test7 {
    public static void main(String[] args) {
        Student st1 = new Student("Pavel", 'm', 22, 3, 8.3);
        Student st2 = new Student("Anna", 'f', 20, 4, 8.9);
        Student st3 = new Student("Ivan", 'm', 23, 2, 7.7);
        Student st4 = new Student("Olga", 'f', 21, 5, 8.0);
        Student st5 = new Student("Inga", 'f', 30, 2, 9.0);

        Faculty f1 = new Faculty("Economics");
        Faculty f2 = new Faculty("Applied mathematics");

        f1.addStudentToFaculty(st1);
        f1.addStudentToFaculty(st2);

        f2.addStudentToFaculty(st3);
        f2.addStudentToFaculty(st4);
        f2.addStudentToFaculty(st5);

        List<Faculty> faculties = new ArrayList<>();
        faculties.add(f1);
        faculties.add(f2);

        faculties.stream()
                .flatMap(faculty -> faculty.getStudentsOnFaculty().stream())
                .forEach(e -> System.out.println(e.getName()));


    }
}

class Faculty {
    String name;
    List<Student> studentsOnFaculty;

    public Faculty(String name) {
        this.name = name;
        studentsOnFaculty = new ArrayList<>();
    }

    public List<Student> getStudentsOnFaculty() {
        return studentsOnFaculty;
    }

    public void addStudentToFaculty(Student s) {
        studentsOnFaculty.add(s);
    }
}
