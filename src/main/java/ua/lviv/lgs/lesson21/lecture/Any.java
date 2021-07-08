package ua.lviv.lgs.lesson21.lecture;

public class Any {
    @Fielder(params = "Any - name annotation")
    private String name;
    @Fielder(params = "Any - height annotation")
    private int heigth;
    @Fielder(params = "Any - id annotation")
    private int id;
    private  int damage;

    public Any(String name, int heigth, int id, int damage) {
        this.name = name;
        this.heigth = heigth;
        this.id = id;
        this.damage = damage;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHeigth() {
        return heigth;
    }

    public void setHeigth(int heigth) {
        this.heigth = heigth;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    @Override
    public String toString() {
        return "Any{" +
                "name='" + name + '\'' +
                ", heigth=" + heigth +
                ", id=" + id +
                ", damage=" + damage +
                '}';
    }
}
