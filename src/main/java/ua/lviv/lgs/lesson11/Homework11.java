package ua.lviv.lgs.lesson11;

import java.util.Arrays;
import java.util.Random;

public class Homework11 {

    public static void main(String[] args) {
//        int [][] arrayOfIntegers = {{1,3,6,3,2},{55,3,1,45,8,3}};
//        System.out.println(Arrays.deepToString(arrayOfIntegers));
//
//        int[][][] trippleArray = new int[2][2][4];
//        System.out.println(Arrays.deepToString(trippleArray));

//        Person [] [] arrayOfPersons = {
//                {new Person("Andrew", 21),new Person("Bob", 22),new Person("Clara", 19)},
//                {new Person("Dork", 18),new Person("Steve", 27),new Person("Kate", 25),}
//        };
//        System.out.println(Arrays.deepToString(arrayOfPersons));
//
//        Person [] [] arrayOfPersons1 = {
//                {new Person("Andrew", getRandomValueFromRange(10,80)),new Person("Bob", getRandomValueFromRange(10,80)),new Person("Clara", getRandomValueFromRange(10,80))},
//                {new Person("Dork", getRandomValueFromRange(10,80)),new Person("Steve", getRandomValueFromRange(10,80)),new Person("Kate", getRandomValueFromRange(10,80)),}
//      };
//        System.out.println(Arrays.deepToString(arrayOfPersons1));


//            boolean[] array1 = new boolean[8];
//            Arrays.fill(array1, true);
//            System.out.println(Arrays.toString(array1));

//        int [] arr = new int[new Random().nextInt(10)];
//        for (int i=0; i<arr.length;i++) {
//            arr[i] = new Random().nextInt(100);
//        }
//        int searched = arr[new Random().nextInt(arr.length)];
//        System.out.println(Arrays.toString(arr));
//        Arrays.sort(arr);
//        System.out.println(Arrays.toString(arr));
//        System.out.println("Location of value "+searched+" is "+Arrays.binarySearch(arr,searched));
//
//
//        int[] ages = new int[4];
//        System.out.println(ages.length);
//        int [] a = new int[3];
//
//        a[0] = arr[0];
//        a[1] = arr[arr.length-1];
//        a[2] = a[1]-a[0];
//        System.out.println(Arrays.toString(a));
    }

    public static int getRandomValueFromRange(int min  , int max){
        if (min>=max){
            throw new IllegalArgumentException("Min value is bigger than max value!");
        }
        Random random = new Random();
        return random.nextInt(max-min + 1)+ min;


    }

}
