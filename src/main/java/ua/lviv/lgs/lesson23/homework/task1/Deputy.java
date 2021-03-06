package ua.lviv.lgs.lesson23.homework.task1;


public class Deputy extends Human {
    private String lastName;
    private String name;
    private boolean briber;
    private int amountOfBribe = 0;

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean getBriber() {
        return briber;
    }

    public void setBriber(boolean briber) {
        this.briber = briber;
    }

    public int getAmountOfBribe() {
        return amountOfBribe;
    }

    public void setAmountOfBribe(int amountOfBribe) {
        this.amountOfBribe = amountOfBribe;
    }

    public Deputy(String lastName, String name, int height, int weight, boolean briber) {
        super(height, weight);
        this.lastName = lastName;
        this.name = name;
        this.briber = briber;
    }

    @Override
    public String toString() {
        return "Deputy{" +
                "lastName='" + lastName + '\'' +
                ", name='" + name + '\'' +
                ", briber=" + briber +
                ", amountOfBribe=" + amountOfBribe +
                '}';
    }

    public void giveBribe(int amount) {
        amountOfBribe = amountOfBribe + amount;
        if (briber == false) {
            System.out.println("Цей депутат не бере хабарів.");
        } else System.out.println("Сума хабара: " + amount);
        if (amountOfBribe > 5000) {
            System.out.println("Поліція заарештує депутата.");
        }

    }

    public boolean isBriber() {
       return this.briber;
    }
}
