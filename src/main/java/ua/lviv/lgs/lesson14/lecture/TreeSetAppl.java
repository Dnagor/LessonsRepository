package ua.lviv.lgs.lesson14.lecture;

import java.util.TreeSet;

public class TreeSetAppl {
    public static void main(String[] args) {
        TreeSet<Person> personTreeSet = new TreeSet<>(new PersonAllFieldsComparator());
        personTreeSet.add(new Person("Bob", 44));
        personTreeSet.add(new Person("Bill", 24));
        personTreeSet.add(new Person("Bill", 74));
        personTreeSet.add(new Person("Bruce", 56));
        for (Person person : personTreeSet ) {
            System.out.println(person);
        }

    }
}
