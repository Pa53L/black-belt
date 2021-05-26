package collection;

import java.util.LinkedList;

public class LinkedListEx1 {
    public static void main(String[] args) {
        Student2 st1 = new Student2("Pavel", 5);
        Student2 st2 = new Student2("Anna", 3);
        Student2 st3 = new Student2("Petya", 4);
        Student2 st4 = new Student2("Inga", 2);
        Student2 st5 = new Student2("Ivan", 5);

        LinkedList<Student2> students = new LinkedList<>();
        students.add(st1);
        students.add(st2);
        students.add(st3);
        students.add(st4);
        students.add(st5);
        System.out.println(students);
        System.out.println(students.get(2));
        Student2 st6 = new Student2("Serega", 3);
        Student2 st7 = new Student2("Nina", 4);
        students.add(st6);
        students.add(1, st7);
        System.out.println(students);
    }
    
}

class Student2 {
    String name;
    int course;

    public Student2(String name, int course) {
        this.name = name;
        this.course = course;
    }

    @Override
    public String toString() {
        return "name: " + name + ", course: " + course;
    }
} 
