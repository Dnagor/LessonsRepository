package ua.lviv.lgs.lesson13;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class StudentSorting {
    public static void main(String[] args) {

        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student(3, "Jack", 22));
        studentList.add(new Student(2, "Jane", 21));
        studentList.add(new Student(2, "Jake", 15));
        studentList.add(new Student(2, "Jaye", 31));
        studentList.add(new Student(2, "Jaye", 11));
        studentList.add(new Student(4, "Antonio", 43));
        studentList.add(new Student(1, "Serena", 67));
        studentList.add(new Student(5, "Bohd", 33));
//        System.out.println("Before");
//        for (Student student: studentList) {
//            System.out.println(student);
//        }
//        System.out.println("After");
//        Collections.sort(studentList);
//        for (Student student: studentList) {
//            System.out.println(student);
//        }
//        Collections.sort(studentList, new StudentAgeComparator());
//        for (Student student : studentList) {
//            System.out.println(student);
//
//        }

        Collections.sort(studentList, new StudentAllFieldsComparator());
        for (Student st: studentList) {
            System.out.println(st);
        }

    }
}
