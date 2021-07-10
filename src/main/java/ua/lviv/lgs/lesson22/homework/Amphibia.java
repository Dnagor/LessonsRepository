package ua.lviv.lgs.lesson22.homework;

@FunctionalInterface
interface Action {
    void action();
}
@FunctionalInterface
interface Voice{
    String voice(String str);
}

public class Amphibia {
    public static void main(String[] args) {
        Amphibia frog = new Frog();
        frog.hanging_out();
        frog.swim();
        Action eat = () -> System.out.println("i am eating");
        eat.action();
        Action sleep = () -> System.out.println("i am sleeping");
        sleep.action();
        Voice quack = (str) ->{ return str.toUpperCase();};
        System.out.println(act(quack,"quack!"));
    }

    void eat() {
        System.out.println("i am eating");
    }

    void sleep() {
        System.out.println("i am sleeping");
    }

    void swim() {
        System.out.println("i ma swimming");
    }

    void hanging_out() {
        System.out.println("i am hanging out");
    }
    static String act(Voice v, String str){
        return v.voice(str);
    }
}

class Frog extends Amphibia {

}