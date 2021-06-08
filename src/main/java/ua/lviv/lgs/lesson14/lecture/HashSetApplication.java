package ua.lviv.lgs.lesson14.lecture;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetApplication {

    public static void main(String[] args) {
/*
        Set<Double> setDouble = new HashSet<>();
        setDouble.add(3.2);
        setDouble.add(1.2);
        setDouble.add(54.2);
        System.out.println(setDouble);
        System.out.println(setDouble.contains(54.2));
        System.out.println(setDouble.isEmpty());
        System.out.println(setDouble.hashCode());
        System.out.println(setDouble.size());
        Set<Double> setDouble2 = new HashSet<>();
        setDouble2.add(1.2);
        setDouble2.add(123.3);
        setDouble2.add(1.34);
        setDouble2.add(45.2);
        setDouble2.add(32.2);
        System.out.println(setDouble.retainAll(setDouble2));
        System.out.println(setDouble+ " "+setDouble.size());
        setDouble.clear();
        System.out.println(setDouble);
        setDouble.addAll(setDouble2);
        System.out.println(setDouble);
        Object[] objects = setDouble.toArray();
        System.out.println(Arrays.toString(objects));
        Iterator<Double> iterator =setDouble.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

        Iterator<Double> iterator2 = setDouble.iterator();
        while(iterator2.hasNext()){
            Double next = iterator2.next();
            if(next<35){
                iterator2.remove();
            }
        }
        System.out.println(setDouble);


        Set<String> stringSet = new HashSet<>();
        stringSet.add("S");
        stringSet.add("R");
        stringSet.add("Q");
        stringSet.add("R");
        System.out.println(stringSet);
 */

        Set<Person> personSet = new HashSet<>();
        personSet.add(new Person("Bobryk",25));
        personSet.add(new Person("Bobryk",25));
        personSet.add(new Person("Bobryk",25));
        Iterator<Person> iterator = personSet.iterator();
        while (iterator.hasNext()){
            Person next = iterator.next();
            System.out.println(next);
        }


    }

}
