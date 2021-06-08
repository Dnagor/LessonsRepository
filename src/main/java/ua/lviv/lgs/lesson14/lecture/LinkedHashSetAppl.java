package ua.lviv.lgs.lesson14.lecture;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetAppl {
    public static void main(String[] args) {
        LinkedHashSet<Person> personLinkedHashSet = new LinkedHashSet<>();
        personLinkedHashSet.add(new Person("June",6));
        personLinkedHashSet.add(new Person("Ion",1000));
        personLinkedHashSet.add(new Person("Lazy",25));
        personLinkedHashSet.add(new Person("Cat",8));
        personLinkedHashSet.add(new Person("Willager",77));

        for (Person person: personLinkedHashSet ) {
            System.out.println(person);
        }
        LinkedHashSet<Person> lhs = new LinkedHashSet<>();
        lhs.add(new Person("June",6));
        lhs.add(new Person("Ion",1000));
        lhs.add(new Person("Lazy",25));
        lhs.add(new Person("Cat",8));
        lhs.add(new Person("Willager",77));
        for (Person person: lhs ) {
            System.out.println(person);
        }
        Iterator<Person> iterator = lhs.iterator();
        while (iterator.hasNext()){
            Person next = iterator.next();
            System.out.println(next);
        }

    }
}
