package ua.lviv.lgs.lesson12.task2;

public class Engine extends Car {
    private int numberOfCylinders;

    public int getNumberOfCylinders() {
        return numberOfCylinders;
    }

    public void setNumberOfCylinders(int numberOfCylinders) {
        this.numberOfCylinders = numberOfCylinders;
    }

    @Override
    public String toString() {
        return "Engine{" +
                "horsePowers=" + horsePowers +
                ", yearOfProduction=" + yearOfProduction +
                ", numberOfCylinders=" + numberOfCylinders +
                '}';
    }
}
