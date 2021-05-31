package ua.lviv.lgs.lesson12;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListApp {

    public static void main(String[] args) {

        LinkedList<Person> list = new LinkedList();


        list.add(new Person("ivat", 23));
        System.out.println(list.get(0).getName());


    }

}
