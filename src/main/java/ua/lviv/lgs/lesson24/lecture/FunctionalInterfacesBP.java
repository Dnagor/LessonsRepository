package ua.lviv.lgs.lesson24.lecture;

import ua.lviv.lgs.lesson23.homework.task1.Faction;

import java.util.function.Function;

public class FunctionalInterfacesBP {
    public static void main(String[] args) {
        useCustomInterface();
        avoidCustomInterface();
    }
    public static void useCustomInterface(){
        CustomInterfaceImpl customInterfacImpl = new CustomInterfaceImpl();
        CustomInterface customInterface = p-> p+"hello world!";
        String result = customInterfacImpl.useCustomMethod("Hello life, ",customInterface);
        System.out.println(result);
    }
    public static void avoidCustomInterface(){
        CustomInterfaceImpl customInterfacImpl = new CustomInterfaceImpl();
        Function<String ,String> functionInterface = p-> p+"hello world!";
        String result = customInterfacImpl.avoidCustomInterface("Hello life, ",functionInterface);
        System.out.println(result);
    }
}
// todo remove, use existing interfaces
@FunctionalInterface
interface CustomInterface{
    String customMethod(String string);
}
class CustomInterfaceImpl{
    public String useCustomMethod(String string,CustomInterface customInterface){
         return customInterface.customMethod(string);
    }
    public String avoidCustomInterface(String string, Function<String,String> fn){
         return fn.apply(string);
    }
}
