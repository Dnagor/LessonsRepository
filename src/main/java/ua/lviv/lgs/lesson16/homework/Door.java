package ua.lviv.lgs.lesson16.homework;

import java.io.Serializable;
import java.util.Objects;

public class Door extends ArchitectureElements implements Serializable, Comparable<Door> {
    public String style;
    public double height;
    private String color;
    private int width;

    public Door(String style, double height, String color, int width) {
        this.style = style;
        this.height = height;
        this.color = color;
        this.width = width;
    }
    public Door(String style, double height) {
        this.style = style;
        this.height = height;
    }

    public Door() {
    }

    public String getStyle() {
        return style;
    }

    public void setStyle(String style) {
        this.style = style;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Door)) return false;
        Door door = (Door) o;
        return height == door.height && width == door.width && Objects.equals(style, door.style) && Objects.equals(color, door.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(style, height, color, width);
    }

    @Override
    public String toString() {
        return "Door{" +
                "Style='" + style + '\'' +
                ", height=" + height +
                ", color='" + color + '\'' +
                ", width=" + width +
                '}';
    }

    @Override
    public int compareTo(Door o) {
        return this.style.compareTo(o.getStyle());
    }

    public void printMyMessage(String s) {
        System.out.println("Method 'printMyMessage' from Door.class " + s + "\n");
    }

    public void printManyParameters(String s, int b) {
        System.out.println("Method 'printMyMessage' from Door.class " + s + " and int from main - " + b);
    }
}
