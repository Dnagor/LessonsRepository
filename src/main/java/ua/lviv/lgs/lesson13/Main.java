package ua.lviv.lgs.lesson13;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>();
        stringList.add("NAT");
        stringList.add("Jet");
        stringList.add("ivq");
        stringList.add("ben");
        stringList.add("ken");
        stringList.add("bar");

        Iterator<String> iterator = stringList.iterator();
        while(iterator.hasNext()){
            String next = iterator.next();
            System.out.println(next);
        }
        Iterator<String> iterator2 = stringList.iterator();
        while(iterator2.hasNext()){
            String next2 = iterator2.next();
            if(next2.contains("e")){
                iterator2.remove();
            }
        }

        Iterator<String> iterator3 = stringList.iterator();
        while (iterator3.hasNext()){
            String next3 = iterator3.next();
            System.out.println(next3);
        }
    }
}
