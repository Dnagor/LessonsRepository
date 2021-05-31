package ua.lviv.lgs.lesson12.task2;

public class Wheel extends Car {
    int wheelDiameter;
    Material wheelMaterial;


    public void setWheelDiameter(int wheelDiameter) {
        this.wheelDiameter = wheelDiameter;
    }


    public void setWheelMaterial(Material wheelMaterial) {
        this.wheelMaterial = wheelMaterial;
    }

    @Override
    public String toString() {
        return "Wheel{" +
                "horsePowers=" + horsePowers +
                ", yearOfProduction=" + yearOfProduction +
                ", wheelDiameter=" + wheelDiameter +
                ", wheelMaterial='" + wheelMaterial + '\'' +
                '}';
    }
}
