package ua.lviv.lgs.lesson22.homework;

public abstract class Pet {
    abstract void voiceClass();

    public static void main(String[] args) {
        Sound cow = message -> System.out.println(message);
        Sound cat = message -> System.out.println(message);
        Sound dog = message -> System.out.println(message);
        Pet pet = new Dog();
        Pet pet1 = new Cat();
        Pet pet2 = new Cow();
        dog.voiceInterface("Я пес!");
        pet.voiceClass();
        cat.voiceInterface("Я кіт!");
        pet1.voiceClass();
        cow.voiceInterface("Я корова!");
        pet2.voiceClass();
    }
}
@FunctionalInterface
interface Sound{
    void voiceInterface(String message);
}
class Dog extends Pet{

    @Override
    void voiceClass() {
        System.out.println("ГавГав!");
    }
}
class Cat extends Pet{

    @Override
    void voiceClass() {
        System.out.println("МяуМяу!");
    }
}
class Cow extends Pet{

    @Override
    void voiceClass() {
        System.out.println("МуМуМу!");
    }
}
