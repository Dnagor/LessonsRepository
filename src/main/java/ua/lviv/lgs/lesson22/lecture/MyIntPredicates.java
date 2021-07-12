package ua.lviv.lgs.lesson22.lecture;

@FunctionalInterface
interface IntPredicate {
    boolean test(int n);
}

class MyIntPredicates {
    static boolean isPrime(int n) {
        if (n < 2) return false;
        for (int i = 2; i < n / i; i++) {
            if ((n % i) == 0)
                return false;
        }
        return true;
    }

    static boolean isEven(int n) {
        return (n % 2) == 0;
    }

    static boolean isPositive(int n) {
        return n > 0;
    }
}

class MethodRefDemo {
    static boolean numTest(IntPredicate p, int v) {
        return p.test(v);
    }

    public static void main(String[] args) {
        boolean res;
        res = numTest(MyIntPredicates::isEven, 12);
        if (res) System.out.println("12 парне число.");
        res = numTest(MyIntPredicates::isPositive, 12);
        if (res) System.out.println("12 додатнє число.");
        res = numTest(MyIntPredicates::isPrime, 11);
        if (res) System.out.println("11 просте число.");
    }
}

class MyIntNum {
    private int v;

    public MyIntNum(int x) {
        v = x;
    }

    public int getNum() {
        return v;
    }

    boolean isFactor(int n) {
        return (v % n) == 0;
    }
}
class MethodRefDemo2{
    public static void main(String[] args) {
        boolean res;
        MyIntNum myIntNum = new MyIntNum(12);
        MyIntNum myIntNum2 = new MyIntNum(16);
        IntPredicate ip = myIntNum::isFactor;
        res = ip.test(6);
        if (res) System.out.println("6 є ділителем "+ myIntNum.getNum());
        ip = myIntNum2::isFactor;
        res = ip.test(7);
        if (!res) System.out.println("7 не є ділителем "+ myIntNum.getNum());
    }
}