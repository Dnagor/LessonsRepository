package ua.lviv.lgs.lesson15.lecture;

import java.util.*;

public class Application {

    public static void main(String[] args) {
        Map<String, List<Student>> map = new HashMap<>();
        //create new group
        map.put("Java", new ArrayList<>());
        map.put("HTML", new ArrayList<>());
        map.put("SQL", new ArrayList<>());
        //add students to group
        Student student = new Student("Johny", 23);
        Student student2 = new Student("Selena", 34);
        Iterator<Map.Entry<String, List<Student>>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()){
            Map.Entry<String, List<Student>> next = iterator.next();
            if(next.getKey().equalsIgnoreCase("Java")){
                List<Student> value = next.getValue();
                value.add(student);
                value.add(student2);
                next.setValue(value);
            }
        }
        System.out.println("до видалення "+map);
        Iterator<Map.Entry<String, List<Student>>> iterator1 = map.entrySet().iterator();
        while (iterator1.hasNext()) {
            Map.Entry<String, List<Student>> next = iterator1.next();
            if (next.getKey().equalsIgnoreCase("Java")) {
                List<Student> groupMembers = next.getValue();
                Iterator<Student> iterator2 = groupMembers.iterator();
                while (iterator2.hasNext()) {
                    Student next1 = iterator2.next();
                    if (next1.getName().equalsIgnoreCase("Johny")) {
                        iterator2.remove();
                    }
                }
            }
        }
        System.out.println("Після видалення " + map);
    }

}

class Student {
    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student)) return false;
        Student student = (Student) o;
        return age == student.age && Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}