package ua.lviv.lgs.lesson24.lecture;

@FunctionalInterface
interface CustomFNInt {
    String test(String s);
}

public class EffectiveFinal {
    public void customMethod() {
        String localVar = "local";
        CustomFNInt ci = p -> {
           // localVar = "local2";
            return localVar;
        };
    }
}