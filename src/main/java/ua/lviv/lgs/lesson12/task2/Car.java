package ua.lviv.lgs.lesson12.task2;

public class Car {
    int horsePowers;
    int yearOfProduction;


    public void setHorsePowers(int horsePowers) {
        this.horsePowers = horsePowers;
    }


    public void setYearOfProduction(int yearOfProduction) {
        this.yearOfProduction = yearOfProduction;
    }

    @Override
    public String toString() {
        return "Car{" +
                "horsePowers=" + horsePowers +
                ", yearOfProduction=" + yearOfProduction +
                '}';
    }
}
