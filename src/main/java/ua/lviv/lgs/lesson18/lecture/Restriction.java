package ua.lviv.lgs.lesson18.lecture;

import java.util.Arrays;

public class Restriction <T extends Number>{

    T[] array;

    public Restriction(T[] array) {
        this.array = array;
    }

    double average(){
        double sum =0;
        for(int i = 0; i<array.length; i++){
            sum= sum + array[i].doubleValue();
        }
        return sum/ array.length;
    }

    public T[] getArray() {
        return array;
    }

    public void setArray(T[] array) {
        this.array = array;
    }

    @Override
    public String toString() {
        return "Restriction{" +
                "array=" + Arrays.toString(array) +
                '}';
    }
}
