package ua.lviv.lgs.lesson22.lecture;

import java.util.Arrays;

interface MyFunc {
    int func(int n);
}

public class VarCapture {
    public static void main(String[] args) {
        int num = 10;
        Double[] doubles = {4.4,22.3,5.0,66.4};
        MyFunc myLambda = (n) -> {
            int v = num + n;
            return v;
        };
        System.out.println(myLambda.func(19));
        MyTransform<Double> sqrts = (v) -> {
            for (int i = 0; i < v.length; i++) {
                v[i] = Math.sqrt(v[i]);
            }
        };
        sqrts.transform(doubles);
        System.out.println(Arrays.toString(doubles));
    }
}
@FunctionalInterface
interface MyTransform<T>{
    void transform(T[] a);
}