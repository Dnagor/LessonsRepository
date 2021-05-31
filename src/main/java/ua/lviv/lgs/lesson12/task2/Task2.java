package ua.lviv.lgs.lesson12.task2;

import java.util.*;

public class Task2 {
    public static void main(String[] args) {

        List<List<Car>> cars = new ArrayList<>();
        for (int i = 0; i < randomInt(10); i++) {
            cars.add(new ArrayList<>());
        }
        for (List<Car> car : cars) {
            for (int i = 0; i < randomInt(10); i++) {
                car.add(getRandom(randomInt(3)));
            }
        }
        System.out.println(cars);


        Scanner sc = new Scanner(System.in);
        System.out.println("To print array pres 1.\nTo fill array with value of Car press 2.");

        switch (sc.nextInt()) {
            case 1: {
                System.out.println(cars);
                break;
            }
            case 2: {
                Car car = new Car();
                car.setHorsePowers(0);
                car.setYearOfProduction(2000);
                for (int i = 0; i < cars.size(); i++) {
                    List<Car> carList = cars.get(i);
                    for (int j = 0; j < carList.size(); j++) {
                        carList.add(j, car);
                        carList.remove(j + 1);
                    }

                }
                System.out.println(cars);
            }
        }

    }

    static int randomInt(int maxValue) {
        return new Random().nextInt(maxValue);
    }

    static Car getRandomCar() {
        Car car = new Car();
        car.setHorsePowers(randomInt(500));
        car.setYearOfProduction(randomInt(2020));
        return car;
    }

    static Car getRandomWheel() {
        Wheel wheel = new Wheel();
        Material[] materials = Material.values();
        int randomint = randomInt(materials.length);
        wheel.setWheelMaterial(materials[randomint]);
        wheel.setWheelDiameter(randomint);
        wheel.setHorsePowers(randomInt(500));
        wheel.setYearOfProduction(randomInt(2020));
        return wheel;
    }

    static Car getRandomEngine() {
        Engine engine = new Engine();
        engine.setYearOfProduction(randomInt(2020));
        engine.setHorsePowers(randomInt(500));
        engine.setNumberOfCylinders(randomInt(8));
        return engine;
    }

    public static Car getRandom(int value) {
        Car select = null;
        switch (value) {
            case 1: {
                select = getRandomWheel();
                break;
            }
            case 2: {
                select = getRandomEngine();
                break;
            }
            case 0: {
                select = getRandomCar();
                break;
            }
        }
        return select;
    }
}