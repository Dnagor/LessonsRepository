package ua.lviv.lgs.lesson19.homework;

import java.io.Serializable;

public class Employee implements Serializable {
    private String name;
    private transient String lastName;
    private int id;
    private transient int salary;

    public Employee(String name, String lastName, int id, int salary) {
        this.name = name;
        this.lastName = lastName;
        this.id = id;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", id=" + id +
                ", salary=" + salary +
                '}';
    }
}
