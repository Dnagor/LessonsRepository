package ua.lviv.lgs.lesson22.lecture;

public class ApplicationLambda {

    public static void main(String[] args) {
        MathOperations add = (int a, int b) -> a+b;
        MathOperations sub = (int a, int b) -> a-b;
        MathOperations mult = (int a, int b) -> {return a*b;};
        MathOperations div = (int a, int b) -> {return a/b;};
        System.out.println(add.operation(4,4));
        System.out.println(make(2,3,mult));
        System.out.println(make(4,2,div));
        int x = make(55,50,sub);
        System.out.println(x);

        Greetings msg = message -> System.out.println(message);
        Greetings msg1 = message -> System.out.println(message+" Hello! ");
        msg.sayHi("Hi");
        msg1.sayHi("goodmorning");
    }
    private static int make(int a, int b,MathOperations operation){
        return operation.operation(a,b);
    }


}
interface MathOperations{
    int operation(int a, int b);
}
interface Greetings{
    void sayHi(String message);
}