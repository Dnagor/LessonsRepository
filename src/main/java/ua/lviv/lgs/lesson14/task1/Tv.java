package ua.lviv.lgs.lesson14.task1;

public class Tv implements Comparable<Tv>{
    private String name;
    private int diagonal;

    public Tv(String name, int diagonal) {
        this.name = name;
        this.diagonal = diagonal;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDiagonal() {
        return diagonal;
    }

    public void setDiagonal(int diagonal) {
        this.diagonal = diagonal;
    }

    @Override
    public int compareTo(Tv o) {
        return this.name.compareTo(o.getName());
    }

    @Override
    public String toString() {
        return "Tv{" +
                "name='" + name + '\'' +
                ", diagonal=" + diagonal +
                '}';
    }
}
