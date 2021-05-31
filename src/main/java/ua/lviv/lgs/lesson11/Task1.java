package ua.lviv.lgs.lesson11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

public class Task1 {
    public static void main(String[] args) {
        Integer [] arrayInt = new Integer[new Random().nextInt(20)];
        for (int i=0; i<arrayInt.length;i++ ) {
            arrayInt[i] = new Random().nextInt(100);
        }
        System.out.println("Unsorted arrayInt: "+ Arrays.toString(arrayInt));
        Arrays.sort(arrayInt);
        System.out.println("Sorted arrayInt: "+ Arrays.toString(arrayInt));
        Arrays.sort(arrayInt ,Collections.reverseOrder());
        System.out.println("Sorted descending arrayInt: "+ Arrays.toString(arrayInt));

        List<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < new Random().nextInt(20); i++) {
			arrayList.add(new Random().nextInt(100));
		}    
        System.out.println("Unsorted Array List: "+ arrayList);
        Collections.sort(arrayList);
        System.out.println("Sorted Array List: "+ arrayList);
        Collections.sort(arrayList, Collections.reverseOrder());
        System.out.println("Sorted descending Array List: "+ arrayList);
        
    }


}
