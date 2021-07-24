package ua.lviv.lgs.lesson24.lecture;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import static java.util.stream.Collectors.*;
import  static java.util.Comparator.*;

public class StreamBP {
    public static void main(String[] args) {
        int i = 0;
        List<Integer> list = new ArrayList<>();
        while (i <= 10) {
            list.add(new Random().nextInt(20));
            i++;
        }
        List<Integer> collect = list.stream().sorted(reverseOrder()).collect(toList());
        System.out.println(collect);

    }
}
