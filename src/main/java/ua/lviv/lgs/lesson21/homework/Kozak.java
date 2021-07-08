package ua.lviv.lgs.lesson21.homework;

public class Kozak {
    @Attack(choice = "NO",power = 5)
    private String alias;
    private String unit;
    @Attack(choice = "Yes")
    private boolean armed;
    @Attack(power = 10)
    private int amountOfSwords;

    public Kozak(String alias, String unit, boolean armed, int amountOfSwords) {
        this.alias = alias;
        this.unit = unit;
        this.armed = armed;
        this.amountOfSwords = amountOfSwords;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public boolean isArmed() {
        return armed;
    }

    public void setArmed(boolean armed) {
        this.armed = armed;
    }

    public int getAmountOfSwords() {
        return amountOfSwords;
    }

    public void setAmountOfSwords(int amountOfSwords) {
        this.amountOfSwords = amountOfSwords;
    }

    @Override
    public String toString() {
        return "Kozak{" +
                "alias='" + alias + '\'' +
                ", unit='" + unit + '\'' +
                ", armed=" + armed +
                ", amountOfSwords=" + amountOfSwords +
                '}';
    }
}
