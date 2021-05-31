package ua.lviv.lgs.lesson12.task3;

import java.util.AbstractList;
import java.util.Arrays;

public class MyList<P> {

    private Object[] objects;
    private Object[] epmptyObject = {};
    private Object[] defaultObject = new Object[10];
    private int defaultSize = 10;
    private int size;

    public MyList(int beginSize) {
        if (beginSize>0){
            this.objects = new Object[beginSize];
        }else if ( beginSize == 0){
            this.objects = epmptyObject;
        }else {
            throw new IllegalArgumentException("Illegal Capacity: "+
                    beginSize);
        }
    }

    public MyList(){
         this.objects = defaultObject;
    }


    public void add(P p) {
        ensureCapacityInternal(size + 1);
        objects[size++] = p;
    }

    private void ensureCapacityInternal(int i) {
    }


    public boolean checkSize(int size) {
        if (size < objects.length) {
            return true;
        }
        return false;
    }
    public int size(){
        return objects.length;
    }

    @Override
    public String toString() {
        return "MyList{" +
                "objects=" + Arrays.toString(objects) +
                ", size=" + size +
                '}';
    }
}
