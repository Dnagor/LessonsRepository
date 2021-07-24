package ua.lviv.lgs.lesson24.lecture;

@FunctionalInterface
interface CustomI {
    void test();
}

public class AnonymousApplication {
    public static void main(String[] args) {
        CustomI customI = new CustomI() {
            @Override
            public void test() {
                System.out.println("Anonymous class.");
            }
        };
        customI.test();
        CustomI customLambda = () -> System.out.println("Lambda.");
        customLambda.test();
    }

}
