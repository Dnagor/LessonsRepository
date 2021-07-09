package ua.lviv.lgs.lesson22.homework;

public class Pet {
    public static void main(String[] args) {
        Sound cow = message -> System.out.println(message);
        Sound cat = message -> System.out.println(message);
        Sound dog = message -> System.out.println(message);
        cow.voice("Я корова!");
        dog.voice("Я пес!");
        cat.voice("Я кіт!");
    }
}
interface Sound{
    void voice(String message);
}

