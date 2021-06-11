package ua.lviv.lgs.lesson15.homework;

import java.util.Objects;

public class Animal {
    private AnimalType animalType;
    private String name;



    public Animal(AnimalType animalType, String name) {
        this.animalType = animalType;
        this.name = name;
    }

    public AnimalType getAnimalType() {
        return animalType;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Animal)) return false;
        Animal animal = (Animal) o;
        return animalType == animal.animalType && Objects.equals(name, animal.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(animalType, name);
    }

    @Override
    public String toString() {
        return "Animal{" +
                "animalType=" + animalType +
                ", name='" + name + '\'' +
                '}';
    }
}
