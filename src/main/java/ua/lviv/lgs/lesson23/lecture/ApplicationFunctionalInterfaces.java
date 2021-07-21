package ua.lviv.lgs.lesson23.lecture;

import java.util.Scanner;
import java.util.function.*;

public class ApplicationFunctionalInterfaces {
    public static void main(String[] args) {
        Predicate<Integer> isPositive = x -> x>0;
        System.out.println(isPositive.test(-3));
        System.out.println(isPositive.test(5));

        BinaryOperator<Integer> multiply = (x,y) -> x*y;
        System.out.println(multiply.apply(4,5));

        UnaryOperator<Integer> square = x-> x*x;
        System.out.println(square.apply(10));

        Function<Integer, String> convert = x-> String.valueOf(x) + "$";
        System.out.println(convert.apply(200));

        Consumer<Integer> print = x -> System.out.printf("%d $ \n",x);
        print.accept(500);

        Supplier<User> userFactory = ()->{
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter use name");
            String name = sc.next();
            sc.close();
            return new User(name);
        };
        User user1 = userFactory.get();
        User user2 = userFactory.get();
        System.out.println(user2.getName());
        System.out.println(user1.getName());

    }

    static class User{
        private String name;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public User(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return "User{" +
                    "name='" + name + '\'' +
                    '}';
        }
    }
}
