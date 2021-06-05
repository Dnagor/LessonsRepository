package ua.lviv.lgs.lesson13;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class StudentIterations {
    public static void main(String[] args) {

        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student(3,"Jack", 22));
        studentList.add(new Student(2,"Jane", 11));
        studentList.add(new Student(4,"Antonio", 43));
        studentList.add(new Student(1,"Serena", 67));
        studentList.add(new Student(5,"Bohd", 33));

        Iterator<Student> iterator = studentList.iterator();
        while(iterator.hasNext()){
            Student next = iterator.next();
            if(next.getAge()>30){
                System.out.println(next);
                iterator.remove();
            }
        }

    }
}
