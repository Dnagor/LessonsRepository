package ua.lviv.lgs.lesson15.homework;

import java.util.*;

public class ZooClub {
    Map<Person, List<Animal>> zooClub = new HashMap<>();
    Reader reader = new ReaderClass();


    public void runMenu() {
        boolean flag = true;
        while (flag) {
            System.out.println("Введіть 1 щоб додати учасника клубу.\n" +
                    "Введіть 2 щоб додати тваринку до учасника клубу.\n" +
                    "Введіть 3 щоб видалити тваринку з учасника клубу.\n" +
                    "Введіть 4 щоб видалити учасника клубу.\n" +
                    "Введіть 5 щоб видалити конктернку тваринку з усіх учасників.\n" +
                    "Введіть 6 щоб вивести весь зооклуб.\n" +
                    "Введіть 7 щоб вийти з програми.");
            switch (reader.readString()) {
                case "1": {
                    String name = readUsername();
                    System.out.println("Введіть вік учасника:");
                    int age = Integer.parseInt(reader.readString());
                    zooClub.put(new Person(name, age),new ArrayList<>());
                    break;
                }
                case "2": {
                    String name = readUsername();
                    Iterator<Map.Entry<Person, List<Animal>>> iterator1 = zooClub.entrySet().iterator();
                    while (iterator1.hasNext()) {
                        Map.Entry<Person, List<Animal>> next = iterator1.next();
                        if (next.getKey().getName().equalsIgnoreCase(name)) {
                            List<Animal> list = next.getValue();
                            list.add(readAnimal());
                            next.setValue(list);
                        }
                    }
                    break;
                }
                case "3": {
                    System.out.println("Оберіть тваринку зі списку: " + Arrays.toString(AnimalType.values()));
                    String animalT = reader.readString();
                    System.out.println("Введіть назву тваринки:");
                    String animalName = reader.readString();
                    String name = readUsername();
                    Iterator<Map.Entry<Person, List<Animal>>> iterator = zooClub.entrySet().iterator();
                    while (iterator.hasNext()){
                        Map.Entry<Person, List<Animal>> next = iterator.next();
                        if (next.getKey().getName().equalsIgnoreCase(name)){
                            List<Animal> list = next.getValue();
                            Iterator<Animal> iterator1 = list.iterator();
                            while (iterator1.hasNext()){
                                Animal next1 = iterator1.next();
                                if (next1.getName().equalsIgnoreCase(animalName)
                                        && next1.getAnimalType().equals(enumValues(animalT))){
                                    iterator1.remove();
                                }
                            }
                        }
                    }
                    System.out.println();
                    break;
                }
                case "4": {
                    String name = readUsername();
                    Iterator<Map.Entry<Person, List<Animal>>> iterator = zooClub.entrySet().iterator();
                    while (iterator.hasNext()) {
                        Map.Entry<Person, List<Animal>> next = iterator.next();
                        if (next.getKey().getName().equalsIgnoreCase(name)) {
                            iterator.remove();
                        }
                    }
                    break;
                }
                case "5": {
                    System.out.println("Щоб видалити тваринку від усіх власників ");
                    Animal animal = readAnimal();
                    Iterator<Map.Entry<Person, List<Animal>>> iterator = zooClub.entrySet().iterator();
                    while (iterator.hasNext()){
                        Map.Entry<Person, List<Animal>> next = iterator.next();
                        List<Animal> list = next.getValue();
                        Iterator<Animal> iterator1 = list.iterator();
                        while (iterator1.hasNext()){
                            Animal next1 = iterator1.next();
                            if (next1.equals(animal)){
                                iterator1.remove();
                            }

                        }
                    }
                    break;
                }
                case "6": {
                    System.out.println(zooClub);
                    break;
                }
                case "7": {
                    System.exit(0);
                    break;
                }

            }
        }
    }

    private String readUsername() {
        System.out.println("Введіть імя учасника клубу");
        return reader.readString();
    }

    private AnimalType enumValues(String animalName) {
        AnimalType[] animalType = AnimalType.values();
        for (AnimalType type : animalType) {
            if (animalName.equalsIgnoreCase(type.name())) {
                return type;
            } else System.out.println("Тваринку не знайдено.");
        }
        return null;// як замінити в такому випадку?
    }
    public Animal readAnimal(){
        System.out.println("Оберіть тваринку зі списку: " + Arrays.toString(AnimalType.values()));
        String animalT = reader.readString();
        System.out.println("Введіть назву тваринки:");
        String animalName = reader.readString();
        return new Animal(enumValues(animalT),animalName);
    }

}
