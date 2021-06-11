package ua.lviv.lgs.lesson15.lecture;

import ua.lviv.lgs.lesson13.Student;

import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

public class TreeMapApp {
    public static void main(String[] args) {

/*        SortedMap<Integer, String> treeMap = new TreeMap<>();

        treeMap.put(1, "monday");
        treeMap.put(3, "wednesday");
        treeMap.put(5, "friday");
        treeMap.put(7, "sunday");
        treeMap.put(2, "tuesday");
        treeMap.put(4, "thursday");
        treeMap.put(6, "saturday");

        System.out.println(treeMap);

        System.out.println(treeMap.subMap(4, 6));
        System.out.println(treeMap.headMap(5));
        System.out.println(treeMap.tailMap(5));
        System.out.println(((TreeMap<Integer, String>) treeMap).descendingMap().values());
*/
        Map<Person,Integer> personMap = new TreeMap<>();

        personMap.put(new  Person("Jack", 22),1);
        personMap.put(new  Person("Bob", 32),54);
        personMap.put(new  Person("Mike", 52),5);
        personMap.put(new  Person("Alison", 19),12);
        personMap.put(new  Person("Alison", 12),67);
        System.out.println(personMap);
        for (Map.Entry<Person,Integer> entry : personMap.entrySet()){
            System.out.println(entry.getKey()+ "  \t"+entry.getValue());
        }
    }
}
