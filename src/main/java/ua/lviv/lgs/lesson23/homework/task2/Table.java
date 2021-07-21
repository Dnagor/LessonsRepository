package ua.lviv.lgs.lesson23.homework.task2;

import java.util.Objects;

public class Table implements Comparable<Table>{

    private String name;
    private int width;
    private int height;
    private int weight;

    public Table(String name, int width, int height, int weight) {
        this.name = name;
        this.width = width;
        this.height = height;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public int getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return "Table{" +
                "name='" + name + '\'' +
                ", width=" + width +
                ", height=" + height +
                ", weight=" + weight +
                '}';
    }

    @Override
    public int compareTo(Table o) {
        return this.name.compareTo(o.getName());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Table)) return false;
        Table table = (Table) o;
        return width == table.width && height == table.height && weight == table.weight && Objects.equals(name, table.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, width, height, weight);
    }
}
