package ua.lviv.lgs.lesson14.lecture;

import java.util.PriorityQueue;

public class PriorityQueueApp {
    public static void main(String[] args) {
        PriorityQueue<Person> priorityQueue = new PriorityQueue<>(new PersonAgeComparator());
        priorityQueue.add(new Person("Bob", 44));
        priorityQueue.add(new Person("Bill", 24));
        priorityQueue.add(new Person("Nicolas", 34));
        priorityQueue.add(new Person("Bill", 74));
        priorityQueue.add(new Person("Bruce", 56));

        priorityQueue.poll();
        for (Person person : priorityQueue) {
            System.out.println(person);
        }
    }


}
