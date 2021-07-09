package ua.lviv.lgs.lesson22.lecture;

import java.util.ArrayList;
import java.util.List;

public class ApplicationMethodReference {
    public static void main(String[] args) {
        List<String> nameList = new ArrayList<>();
        nameList.add("Ben");
        nameList.add("Jack");
        nameList.add("Stepan");
        nameList.add("Roman");
        nameList.add("Olya");
        nameList.forEach(System.out::println);
    }
}
