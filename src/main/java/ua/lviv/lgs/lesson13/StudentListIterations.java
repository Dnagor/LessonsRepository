package ua.lviv.lgs.lesson13;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class StudentListIterations {

    public static void main(String[] args) {

        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student(3, "Jack", 22));
        studentList.add(new Student(2, "Jane", 11));
        studentList.add(new Student(4, "Antonio", 43));
        studentList.add(new Student(1, "Serena", 67));
        studentList.add(new Student(5, "Bohd", 33));


        ListIterator<Student> studentListIterator = studentList.listIterator();
        while (studentListIterator.hasNext()) {
            Student next = studentListIterator.next();
            System.out.println(next);
        }
//
        System.out.println();
        while (studentListIterator.hasPrevious()) {
            Student previous = studentListIterator.previous();
         if (previous.getAge() == 43){
             studentListIterator.add(new Student(2, "Ion", 35));
         }
        }

        System.out.println();
        while (studentListIterator.hasNext()) {
            Student next = studentListIterator.next();
            System.out.println(next);
        }
    }
}


