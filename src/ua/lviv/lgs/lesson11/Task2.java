package ua.lviv.lgs.lesson11;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {

        Car[][] cars = new Car[randomInt(5)][randomInt(5)];
        for (int i = 0; i < cars.length; i++) {
            for (int j = 0; j < cars[i].length; j++) {
                cars[i][j] = getRandom(randomInt(3));
            }
        }
        System.out.println(Arrays.deepToString(cars));
        Scanner sc = new Scanner(System.in);
        System.out.println("To print array pres 1.\nTo fill array with value of Wheel press 2.");

        switch (sc.nextInt()) {
            case 1: {
                System.out.println(Arrays.deepToString(cars));
                break;
            }
            case 2: {
                Car car = new Car();
                car.setHorsePowers(0);
                car.setYearOfProduction(2000);
                for (Car[] xxx: cars){
                        Arrays.fill(xxx, car);
                }
                System.out.println(Arrays.deepToString(cars));
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