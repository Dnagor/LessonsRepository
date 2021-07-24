package ua.lviv.lgs.lesson24.lecture;
@FunctionalInterface
public interface DefaultMethod extends CustomInterfaceOne,CustomInterfaceTwo{
    @Override
    default void regularDefaultMethod() {
        CustomInterfaceOne.super.regularDefaultMethod();
    }
}

@FunctionalInterface
interface CustomInterfaceOne{
    String customMethod();
    default void regularDefaultMethod(){
        System.out.println("Do one");
    }
}

@FunctionalInterface
interface CustomInterfaceTwo{
    String customMethod();
    default void regularDefaultMethod(){
        System.out.println("Do two");
    }
}