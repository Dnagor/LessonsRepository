package ua.lviv.lgs.lesson22.lecture;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class ApplicationFunctionalInterface {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8);
        System.out.println("Show all numbers");
        even(list,n->true);
        even(list,n->n%2==0);
        even(list,n->n>4);
    }
    public static void even(List<Integer> list, Predicate<Integer> predicate){
        for (Integer integer: list) {
            if (predicate.test(integer)){
                System.out.println(integer);
            }
        }
        System.out.println();
    }
}
